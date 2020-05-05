package com.ceb.manager.dao;

import com.ceb.manager.domain.User;
import com.ceb.manager.repository.CustomBaseRepository;
import com.ceb.manager.repository.UserRepository;

import org.springframework.stereotype.Component;

@Component
public interface UserDAO extends CustomBaseRepository<User,Long>,UserRepository{

}