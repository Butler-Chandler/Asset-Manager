package ceb.assetManager.repository.user;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ceb.assetManager.domain.User;

@Repository
public class UserRepositoryImpl implements UserRepository{
    
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public User findByEmail(String email){
        Query query = entityManager.createNativeQuery("SELECT usr.* FROM asset_manager.usr as usr WHERE usr.email = ?", User.class);
        query.setParameter(1, email);

        return (User) query.getSingleResult();
    }
}