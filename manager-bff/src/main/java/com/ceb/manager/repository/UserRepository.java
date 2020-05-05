package com.ceb.manager.repository;

import com.ceb.manager.domain.User;

public interface UserRepository{
    User findByEmail(String email);
}