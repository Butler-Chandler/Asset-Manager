package com.ceb.manager.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ceb.manager.domain.User;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{
    
    @PersistenceContext
    EntityManager entityManager;

    public User findByEmail(String email){
        Query query = entityManager.createNativeQuery("SELECT usr.* FROM asset_manager.usr as usr WHERE usr.email = ?", User.class);
        query.setParameter(1, email);

        return (User) query.getSingleResult();
    }
}