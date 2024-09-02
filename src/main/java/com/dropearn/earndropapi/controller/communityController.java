package com.dropearn.earndropapi.controller;

import com.dropearn.earndropapi.Entity.userEntity;
import com.dropearn.earndropapi.Entity.walletCommunityEntity;
import com.dropearn.earndropapi.emailService.EmailServiceImpl;
import com.dropearn.earndropapi.emailService.newsletter;
import com.dropearn.earndropapi.service.communityService;
import com.dropearn.earndropapi.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wallet")
public class communityController {
    final communityService service;
    final userService userservice;

    @Autowired
    private EmailServiceImpl emailService;

    public communityController(communityService service, userService userservice) {
        this.service = service;
        this.userservice = userservice;
    }

    @PostMapping("/create")
    public walletCommunityEntity createNewPost(@RequestBody walletCommunityEntity entity){
            Runnable runnable = () -> {
                System.out.println("Invoke");
                List<userEntity> list = userservice.getallUser();
                newsletter newsletter = new newsletter(emailService);
                newsletter.sendnewsLetter(list,entity);
            };
            runnable.run();
            try{
        service.save(entity);
            }catch (Exception e){
                e.fillInStackTrace();
            }
        return entity;
    }


    @GetMapping("/getAll")
    public List<walletCommunityEntity> getAll(){
        return service.getCommunityList();
    }
}
