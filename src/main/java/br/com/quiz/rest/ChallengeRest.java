package br.com.quiz.rest;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.quiz.entity.CardEntity;
import br.com.quiz.entity.ChallengeEntity;
import br.com.quiz.entity.UserEntity;
import br.com.quiz.repository.ChallengeRepository;

@RestController
@RequestMapping("/api/challenge")
public class ChallengeRest {
	
	@Autowired
	private ChallengeRepository repository;

	@RequestMapping(method = RequestMethod.GET)
    public Iterable<ChallengeEntity> getAllChallenges() {
		return repository.findAll();
//		return new ChallengeMapper().convertTO(challenges);
    }

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> add(@RequestParam(name = "idChallenger", required = true) Long idChallenger,
			@RequestParam(name = "idChallenged", required = true) Long idChallenged,
			@RequestParam(name = "idCard", required = true) Long idCard,
			@RequestParam(name = "pointsChallenger", required = true) Integer pointsChallenger) {
		
		ChallengeEntity entity = new ChallengeEntity();
		
		entity.setChallenger(new UserEntity(idChallenger));
		entity.setChallenged(new UserEntity(idChallenged));
		entity.setCard(new CardEntity(idCard));
		entity.setPointsChallenger(pointsChallenger);
		entity.setDateChallenge(new Date());

		ChallengeEntity challenge = repository.save(entity);
		
		return ResponseEntity.ok(challenge);
	}

}
