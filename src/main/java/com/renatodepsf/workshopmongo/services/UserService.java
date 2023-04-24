package com.renatodepsf.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renatodepsf.workshopmongo.domain.User;
import com.renatodepsf.workshopmongo.repository.UserRepostiory;

@Service
public class UserService {
	
	@Autowired UserRepostiory repostiory;

	public List<User> findAll() {
		return repostiory.findAll();
	}
}
