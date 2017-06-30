package br.com.quiz.mapper;

import br.com.quiz.entity.UserEntity;
import br.com.quiz.repository.dto.UserDTO;

public class UserMapper extends MapperAbstract<UserEntity, UserDTO> {

	@Override
	public UserDTO convertTO(UserEntity from) {
		
		UserDTO dto = new UserDTO();
		
		if(from == null){
			return dto;
		}
		
		dto.setId(from.getId());
		dto.setPassword(from.getPassword());
		dto.setUsername(from.getUsername());
		
		return dto;
	}

}
