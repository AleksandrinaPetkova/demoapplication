package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaapp.demoapplication.User;

import repository.UserRepository;

@Controller
public class RegistrationController {
	
	private UserRepository userRepository;

	@RequestMapping(value="/registration")
    public String createNewUser(User user) {
	
	userRepository.save(user);
	return "/registration";
    }

}
