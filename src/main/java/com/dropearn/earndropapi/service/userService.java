package com.dropearn.earndropapi.service;

import com.dropearn.earndropapi.Entity.userEntity;
import com.dropearn.earndropapi.repo.userRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class userService {

    final userRepo repo;


    public userService(userRepo repo) {
        this.repo = repo;
    }


    public userEntity getuserbyId(Integer id) {
       return repo.getById(id);
    }
    public userEntity getuserbyEmail(String email) {
        return repo.findByEmail(email);
    }

    public List<userEntity> getallUser(){
        return repo.findAll();
    }
    public userEntity createNewUser(@ModelAttribute userEntity user) {
        System.out.println(user);
        return repo.save(user);
    }

    public boolean isExist(String email) {
        return repo.findByEmail(email) != null;
    }
    public String deleteUserByEmail(Integer id) {

            try {
                repo.deleteById(id);
                return "User Deleted Successfully";
            } catch (Exception e) {
                e.printStackTrace();
                return "Delete Failed";
            }
    }

}
