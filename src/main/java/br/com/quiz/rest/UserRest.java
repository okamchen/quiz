package br.com.quiz.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.quiz.entity.UserEntity;
import br.com.quiz.repository.UserRepository;
import br.com.quiz.repository.dto.UserDTO;

@RestController
@RequestMapping("/api/user")
public class UserRest {

	@Autowired
	private UserRepository repository;
	
	@RequestMapping(method = RequestMethod.GET)
    public List<UserDTO> getUsers() {
		Iterable<UserEntity> entities = repository.findAll();
		
		List<UserDTO> usuarios = new ArrayList<>();
		for(UserEntity entity : entities){
			usuarios.add(new UserDTO(entity.getId(), entity.getUsername(), entity.getPassword()));
		}
		
		return usuarios;
    }
	
	@RequestMapping(method = RequestMethod.POST)
	public UserDTO createAccount(@RequestParam(name = "password", required = true) String password,
			@RequestParam(name = "username", required = true) String username) {
		
		UserEntity user = new UserEntity();
		user.setUsername(username);
		user.setPassword(password);
		
		UserEntity entity = repository.save(user);
    	 
		return new UserDTO(entity.getId(), entity.getUsername(), entity.getPassword());
    }

}
