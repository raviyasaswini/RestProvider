package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Service
public class Controller {

	@Autowired
	private UserService user;
	
	
	

	@GetMapping("/save")
	public ResponseEntity<Users> getdata(@RequestBody Users use) {

		Optional<Users> save = Optional.ofNullable(user.save(use));
		
		if(save.isPresent()) {
			return new ResponseEntity<Users>(save.get(),HttpStatus.OK);
			
		}
		else {
			return new ResponseEntity<Users>(save.orElseThrow(),HttpStatus.BAD_REQUEST);
		}
	}

}
