package com.ceb.manager.controllers;

import com.ceb.manager.controllers.response.RestResponse;
import com.ceb.manager.dao.UserDAO;
import com.ceb.manager.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired 
    UserDAO userDao;

    @RequestMapping("/user")
    public User getUserInfo(@RequestParam(name = "email") String email) {
        User user = userDao.findByEmail(email);

        return user;
    }

    @PostMapping("/user")
    public RestResponse saveOrUpdateUserDetails(@RequestBody User user) {
        //save user to db
        //return status of save 200 success failed 422
        try{
            User existingUser = userDao.findByEmail(user.getEmail());
            if(existingUser != null){
                existingUser.deepCopy(user);
                userDao.save(existingUser);
            } else{
                userDao.save(user);
            }
        
            return new RestResponse(200L);
        } catch(Exception e){
            return new RestResponse(422L);
        }
    }

    public UserDAO getUserDao() {
        return this.userDao;
    }

    public void setUserDao(UserDAO userDao) {
        this.userDao = userDao;
    }
}