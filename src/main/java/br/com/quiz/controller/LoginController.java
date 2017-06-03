package br.com.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.quiz.entity.UserEntity;
import br.com.quiz.repository.UserRepository;

/**
 *
 * @author Ahron Henrique Helfenstein <ahron.helfenstein@cwi.com.br>
 */
@Controller
public class LoginController {
	

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @PostMapping(path = "/login/user")
	public String createAccount(@RequestParam(name = "password", required = true) String password,
			@RequestParam(name = "username", required = true) String username, 
			Model model) {
    	
    	UserEntity usuario = new UserEntity();
    	
    	usuario.setPassword(password);
		usuario.setUsername(username);
		
		userRepository.save(usuario);
    
    	return "redirect:/";
    }

}
