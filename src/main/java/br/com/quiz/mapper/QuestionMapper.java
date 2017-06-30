package br.com.quiz.mapper;

import br.com.quiz.entity.QuestionEntity;
import br.com.quiz.repository.dto.QuestionDTO;

public class QuestionMapper extends MapperAbstract<QuestionEntity, QuestionDTO> {

	@Override
	public QuestionDTO convertTO(QuestionEntity from) {
		
		QuestionDTO dto = new QuestionDTO();
		
		if(from == null){
			return dto;
		}
		
		dto.setAwser(from.isAwser());
		dto.setDescription(from.getDescription());
		dto.setId(from.getId());
		dto.setPunctuation(from.getPunctuation());
		
		return dto;
	}

}
