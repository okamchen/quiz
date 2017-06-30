var cards = [
  {
    cardId: 1,
    label: 'Conhecimento gerais',
    questions: [
      {id: 1, question: 'Pergunta 1?', anwser: true},
      {id: 2, question: 'Pergunta 2?', anwser: true},
      {id: 3, question: 'Pergunta 3?', anwser: true},
      {id: 4, question: 'Pergunta 4?', anwser: true},
      {id: 5, question: 'Pergunta 5?', anwser: true},
      {id: 6, question: 'Pergunta 6?', anwser: true},
    ]
  },
  {
    cardId: 2,
    label: 'Geografia',
    questions: [
      {id: 1, question: 'Pergunta 1?', anwser: true},
      {id: 2, question: 'Pergunta 2?', anwser: true},
      {id: 3, question: 'Pergunta 3?', anwser: true},
      {id: 4, question: 'Pergunta 4?', anwser: true},
      {id: 5, question: 'Pergunta 5?', anwser: true},
      {id: 6, question: 'Pergunta 6?', anwser: true},
    ]
  },
  {
    cardId: 3,
    label: 'História',
    questions: [
      {id: 1, question: 'Pergunta 1?', anwser: true},
      {id: 2, question: 'Pergunta 2?', anwser: true},
      {id: 3, question: 'Pergunta 3?', anwser: true},
      {id: 4, question: 'Pergunta 4?', anwser: true},
      {id: 5, question: 'Pergunta 5?', anwser: true},
      {id: 6, question: 'Pergunta 6?', anwser: true},
    ]
  },
  {
    cardId: 4,
    label: 'Seriados',
    questions: [
      {id: 1, question: 'Pergunta 1?', anwser: true},
      {id: 2, question: 'Pergunta 2?', anwser: true},
      {id: 3, question: 'Pergunta 3?', anwser: true},
      {id: 4, question: 'Pergunta 4?', anwser: true},
      {id: 5, question: 'Pergunta 5?', anwser: true},
      {id: 6, question: 'Pergunta 6?', anwser: true},
    ]
  },
  {
    cardId: 5,
    label: 'Esportes',
    questions: [
      {id: 1, question: 'Pergunta 1?', anwser: true},
      {id: 2, question: 'Pergunta 2?', anwser: true},
      {id: 3, question: 'Pergunta 3?', anwser: true},
      {id: 4, question: 'Pergunta 4?', anwser: true},
      {id: 5, question: 'Pergunta 5?', anwser: true},
      {id: 6, question: 'Pergunta 6?', anwser: true},
    ]
  },
]

var challenge = {
  id: 0,
  userChallenged: 0,
  userAsserts: 0,
}

localStorage.setItem('challenge', JSON.stringify(challenge));

function appendQuestionInTheHTML(currentQuestion) {
  $('#card-container').append(`
    <div id='question'>
      <div class="col-md-8 card">
        <div class="cold-md-8 pergunta">
          <p>` + currentQuestion.question + `</p>

          <a type="button" class="btn btn-success btn-true" href="#" cardId="` + currentQuestion.id + `"><span class="glyphicon glyphicon-ok"></span></a>
          <a type="button" class="btn btn-danger btn-false" href="#" cardId="` + currentQuestion.id + `"><span class="glyphicon glyphicon-remove"></span></a>
        </div>
      </div>
    </div>
  `)
}

function finishChallenge(assertQuestions) {
  var challengeSelected = JSON.parse(localStorage.getItem('challenge'));
  var cardId = JSON.parse(localStorage.getItem('cardId'));

  if (challengeSelected !== 0) {
    $.ajax({
      method: "POST",
      url: "some.php",
      data: { name: "John", location: "Boston" }
    })
      .done(function( msg ) {
        $('#card-container').append(`
          <div id='question'>
            <h1>Você finalizou seu desafio 😀</h1>
            <h2>Você acertou ` + assertQuestions + ` questões!</h2>
          </div>
        `)
      })
      .fail(function( msg ) {
        $('#card-container').append(`
          <div id='question'>
            <h1>Algo de errado aconteceu ao salvar seu desafio.</h1>
          </div>
        `)
      })
  } else {
    $.ajax({
      method: "POST",
      url: "some.php",
      data: { name: "John", location: "Boston" }
    })
      .done(function( msg ) {
        $('#card-container').append(`
          <div id='question'>
            <h1>Você finalizou seu desafio 😀</h1>
            <h2>Você acertou ` + assertQuestions + ` questões!</h2>
          </div>
        `)
      })
      .fail(function( msg ) {
        $('#card-container').append(`
          <div id='question'>
            <h1>Algo de errado aconteceu ao salvar seu desafio.</h1>
          </div>
        `)
      })
  }
}

$(document).ready(function() {
  localStorage.setItem('cards', JSON.stringify(cards));
  localStorage.setItem('userAnswers', JSON.stringify([]));
  var currentCards = JSON.parse(localStorage.getItem('cards'));

  for (var i = currentCards.length - 1; i >= 0; i--) {
    $('#card-list')
      .append("<li><a class='card_list' id='" + currentCards[i].cardId + "' href='#'>"
              + currentCards[i].label + "</a></li>");
  }

  $('.user').click(function() {
    var challengeSelected = JSON.parse(localStorage.getItem('challenge'));

    if (challengeSelected.userChallenged === 0) {
      $(this).append('<span> ✅</span>')
      challengeSelected.userChallenged = Number($(this).attr('id'));
      localStorage.setItem('challenge', JSON.stringify(challengeSelected));
    }
  })

  $('.challenge').click(function() {
    var challengeId = Number($(this).attr('id'));
    var cardId = Number($(this).attr('cardList'));

    var challengeSelected = JSON.parse(localStorage.getItem('challenge'));

    if (challengeSelected.id === 0) {
      $(this).append('<span> ✅</span>');
      challengeSelected.id = challengeId;
      localStorage.setItem('challenge', JSON.stringify(challengeSelected));
      localStorage.setItem('cardId', JSON.stringify(cardId));

      cards = JSON.parse(localStorage.getItem('cards'));
      var questions;

      var getCardList = function(current) {
        return Number(current.cardId) === cardId
      }

      var cardList = R.filter(getCardList, cards)[0];
      var currentQuestion = cardList.questions[0];
      localStorage.setItem('cardQuestions', JSON.stringify(cardList.questions));

      $('#card-list-container').hide()

      appendQuestionInTheHTML(currentQuestion)
    }
  })

  $('.card_list').click(function() {
    var challengeSelected = JSON.parse(localStorage.getItem('challenge'));

    if (challengeSelected.userChallenged === 0) {
      alert('Você precisa selecionar um usuário antes de começar o desafio.');
    } else {
      var cardId = $(this).attr('id');

      localStorage.setItem('challenge', JSON.stringify(challengeSelected));
      localStorage.setItem('cardId', JSON.stringify(cardId));

      cards = JSON.parse(localStorage.getItem('cards'));
      var questions;

      var getCardList = function(current) {
        return Number(current.cardId) === Number(cardId)
      }

      var cardList = R.filter(getCardList, cards)[0];
      var currentQuestion = cardList.questions[0];
      localStorage.setItem('cardQuestions', JSON.stringify(cardList.questions));

      $('#card-list-container').hide()

      appendQuestionInTheHTML(currentQuestion)
    }
  })

  $(document).on('click', '.btn', function() {
    var questionId = $(this).attr('cardId');
    var questions = JSON.parse(localStorage.getItem('cardQuestions'))
    var userAnswers = JSON.parse(localStorage.getItem('userAnswers'))

    var getQuestion = function(current) {
      return Number(current.id) === Number(questionId)
    }

    var question = R.filter(getQuestion, questions)[0];
    var userAnswer = $(this).hasClass('btn-true');

    var challengeSelected = JSON.parse(localStorage.getItem('challenge'));
    challengeSelected.userAsserts += userAnswer === question.anwser ? 1 : 0;
    localStorage.setItem('challenge', JSON.stringify(challengeSelected));

    questions.shift();

    localStorage.setItem('cardQuestions', JSON.stringify(questions));

    $('#question').remove();

    questions.length > 0
      ? appendQuestionInTheHTML(questions[0])
      : finishChallenge(challengeSelected.userAsserts);
  })
})
