package br.com.quiz.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.quiz.entity.CardEntity;
import br.com.quiz.repository.CardRepository;

@RestController
@RequestMapping("/api/card")
public class CardRest {

	@Autowired
	private CardRepository repository;
	
	@RequestMapping(method = RequestMethod.GET)
    public Iterable<CardEntity> getCards() {
		return repository.findAll();
    }
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
    public CardEntity getCardById(@PathVariable(name = "id", required = true) Long id) {
		return repository.findOne(id);
    }
	
}
