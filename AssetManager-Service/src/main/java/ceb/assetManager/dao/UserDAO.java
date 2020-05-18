package ceb.assetManager.dao;

import org.springframework.stereotype.Component;

import ceb.assetManager.domain.User;
import ceb.assetManager.repository.CustomBaseRepository;
import ceb.assetManager.repository.user.UserRepository;

@Component
public interface UserDAO extends CustomBaseRepository<User,Long>,UserRepository{

}