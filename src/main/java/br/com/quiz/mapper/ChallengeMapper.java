package br.com.quiz.mapper;

import br.com.quiz.entity.ChallengeEntity;
import br.com.quiz.repository.dto.ChallengeDTO;

public class ChallengeMapper extends MapperAbstract<ChallengeEntity, ChallengeDTO> {
	
	@Override
	public ChallengeDTO convertTO(ChallengeEntity from) {
		
		if(from == null){
			return new ChallengeDTO();
		}
		
		ChallengeDTO dto = new ChallengeDTO();
//		dto.setCard(new CardMapper().convertTO(from.getCard()));
//		dto.setChallenged(new UserMapper().convertTO(from.getChallenged()));
//		dto.setChallenger(new UserMapper().convertTO(from.getChallenger()));
		dto.setDateChallenge(from.getDateChallenge());
		dto.setId(from.getId());
		dto.setPointsChallenged(from.getPointsChallenged());
		dto.setPointsChallenger(from.getPointsChallenger());
		
		return dto;
	}

}
