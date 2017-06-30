package br.com.quiz.mapper;

import br.com.quiz.entity.CardEntity;
import br.com.quiz.repository.dto.CardDTO;

public class CardMapper extends MapperAbstract<CardEntity, CardDTO> {

	@Override
	public CardDTO convertTO(CardEntity from) {
		
		CardDTO dto = new CardDTO();
		if(from == null){
			return dto;
		}
		
		dto.setId(from.getId());
		dto.setName(from.getName());
		dto.setQuestions(new QuestionMapper().convertTO(from.getQuestions()));
		
		return dto;
	}
	

}
