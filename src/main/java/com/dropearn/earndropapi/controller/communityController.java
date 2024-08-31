package com.dropearn.earndropapi.controller;

import com.dropearn.earndropapi.Entity.walletCommunityEntity;
import com.dropearn.earndropapi.service.communityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wallet")
public class communityController {
    final communityService service;

    public communityController(communityService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public String createNewPost(@RequestBody walletCommunityEntity entity){
        return service.save(entity);
    }

    @GetMapping("/getAll")
    public List<walletCommunityEntity> getAll(){
        return service.getCommunityList();
    }
}
