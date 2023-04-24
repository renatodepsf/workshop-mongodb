package com.renatodepsf.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.renatodepsf.workshopmongo.domain.User;

public interface UserRepostiory extends MongoRepository<User, String> {
}
