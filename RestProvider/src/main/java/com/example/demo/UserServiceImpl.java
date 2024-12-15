package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
@Controller
public class UserServiceImpl implements UserService {

	private UserServiceRepo repo;
	
    @Autowired
	public void setRepo(UserServiceRepo repo) {
		this.repo = repo;
	}

	@Override
	public Users save(Users user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

}
