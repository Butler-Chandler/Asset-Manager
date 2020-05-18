package ceb.assetManager.repository.user;

import ceb.assetManager.domain.User;

public interface UserRepository {
    User findByEmail(String email);
}