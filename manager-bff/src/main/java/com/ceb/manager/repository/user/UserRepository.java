package com.ceb.manager.repository.user;

import com.ceb.manager.domain.User;

public interface UserRepository {
    User findByEmail(String email);
}