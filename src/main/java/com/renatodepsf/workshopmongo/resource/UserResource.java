package com.renatodepsf.workshopmongo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.renatodepsf.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/user")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		List<User> list = new ArrayList<>();
		User maria = new User("1", "Maria Brown", "maria@gmail.com");
		User alex = new User("1", "Alex Silva", "alex@gmail.com");
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok(list);
	}
}
