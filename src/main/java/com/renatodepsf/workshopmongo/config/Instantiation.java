package com.renatodepsf.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.renatodepsf.workshopmongo.domain.User;
import com.renatodepsf.workshopmongo.repository.UserRepostiory;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired UserRepostiory repostiory;

	@Override
	public void run(String... args) throws Exception {

		repostiory.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		repostiory.saveAll(Arrays.asList(maria, alex, bob));
		
	}

}
