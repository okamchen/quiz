var cards = []

$.ajax({
  method: "GET",
  url: "/api/card",
})
.done(function(msg) {
	var challenge = {
			  id: 0,
			  userChallenged: 0,
			  userAsserts: 0,
			}

			localStorage.setItem('challenge', JSON.stringify(challenge));

			function appendQuestionInTheHTML(currentQuestion) {
			  $('#card-container').append(`
			    <div id='description'>
			      <div class="col-md-8 card">
			        <div class="cold-md-8 pergunta">
			          <p>` + currentQuestion.description + `</p>

			          <a type="button" class="btn btn-success btn-true" href="#" id="` + currentQuestion.id + `"><span class="glyphicon glyphicon-ok"></span></a>
			          <a type="button" class="btn btn-danger btn-false" href="#" id="` + currentQuestion.id + `"><span class="glyphicon glyphicon-remove"></span></a>
			        </div>
			      </div>
			    </div>
			  `)
			}

			function finishChallenge(assertQuestions) {
			  var challengeSelected = JSON.parse(localStorage.getItem('challenge'));
			  console.log(challengeSelected);
			  var id = JSON.parse(localStorage.getItem('id'));

			  if (challengeSelected !== 0) {
			    $.ajax({
			      method: "POST",
			      url: "/api/challenge",
			      data: { idChallenger: 1, idChallenged: 2, idCard: 1, pointsChallenger: 10},
			    })
			      .done(function( msg ) {
			        $('#card-container').append(`
			          <div id='description'>
			            <h1>Você finalizou seu desafio 😀</h1>
			            <h2>Você acertou ` + assertQuestions + ` questões!</h2>
			          </div>
			        `)
			      })
			      .fail(function( msg ) {
			        $('#card-container').append(`
			          <div id='description'>
			            <h1>Algo de errado aconteceu ao salvar seu desafio.</h1>
			          </div>
			        `)
			      })
			  } else {
			        $('#card-container').append(`
			          <div id='description'>
			            <h1>Algo de errado aconteceu ao salvar seu desafio.</h1>
			          </div>
			        `)
			  }
			}

			  localStorage.setItem('cards', JSON.stringify(msg));
			  localStorage.setItem('userAnswers', JSON.stringify([]));
			  var currentCards = JSON.parse(localStorage.getItem('cards'));

			  for (var i = currentCards.length - 1; i >= 0; i--) {
			    $('#card-list')
			      .append("<li><a class='card_list' id='" + currentCards[i].id + "' href='#'>"
			              + currentCards[i].name + "</a></li>");
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
			    var id = Number($(this).attr('cardList'));

			    var challengeSelected = JSON.parse(localStorage.getItem('challenge'));

			    if (challengeSelected.id === 0) {
			      $(this).append('<span> ✅</span>');
			      challengeSelected.id = challengeId;
			      localStorage.setItem('challenge', JSON.stringify(challengeSelected));
			      localStorage.setItem('id', JSON.stringify(id));

			      cards = JSON.parse(localStorage.getItem('cards'));
			      var questions;

			      var getCardList = function(current) {
			        return Number(current.id) === id
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
			      var id = $(this).attr('id');

			      localStorage.setItem('challenge', JSON.stringify(challengeSelected));
			      localStorage.setItem('id', JSON.stringify(id));

			      cards = JSON.parse(localStorage.getItem('cards'));
			      var questions;

			      var getCardList = function(current) {
			        return Number(current.id) === Number(id)
			      }

			      var cardList = R.filter(getCardList, cards)[0];
			      var currentQuestion = cardList.questions[0];
			      localStorage.setItem('cardQuestions', JSON.stringify(cardList.questions));

			      $('#card-list-container').hide()

			      appendQuestionInTheHTML(currentQuestion)
			    }
			  })

			  $(document).on('click', '.btn', function() {
			    var questionId = $(this).attr('id');
			    var questions = JSON.parse(localStorage.getItem('cardQuestions'))
			    var userAnswers = JSON.parse(localStorage.getItem('userAnswers'))

			    var getQuestion = function(current) {
			      return Number(current.id) === Number(questionId)
			    }

			    var description = R.filter(getQuestion, questions)[0];
			    var userAnswer = $(this).hasClass('btn-true');

			    var challengeSelected = JSON.parse(localStorage.getItem('challenge'));
			    challengeSelected.userAsserts += userAnswer === description.awser ? 1 : 0;
			    localStorage.setItem('challenge', JSON.stringify(challengeSelected));

			    questions.shift();

			    localStorage.setItem('cardQuestions', JSON.stringify(questions));

			    $('#description').remove();

			    questions.length > 0
			      ? appendQuestionInTheHTML(questions[0])
			      : finishChallenge(challengeSelected.userAsserts);
			  })

})
.fail(function(msg) {
  console.log(msg)
})