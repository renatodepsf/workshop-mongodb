package com.renatodepsf.workshopmongo.resource;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renatodepsf.workshopmongo.domain.User;
import com.renatodepsf.workshopmongo.dto.UserDto;
import com.renatodepsf.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/user")
public class UserResource {
	
	@Autowired UserService service;
	
	@GetMapping
	public ResponseEntity<List<UserDto>> findAll() {
		List<User> list = service.findAll();
		List<UserDto> listDto = list.stream().map(e -> new UserDto(e)).collect(Collectors.toList());
		return ResponseEntity.ok(listDto);
	}
}
