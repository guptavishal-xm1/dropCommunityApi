package com.dropearn.earndropapi.service;


import com.dropearn.earndropapi.Entity.walletCommunityEntity;
import com.dropearn.earndropapi.repo.communityRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class communityService {
    final communityRepo repo;
    public communityService(communityRepo repo) {
        this.repo = repo;
    }

    public List<walletCommunityEntity> getCommunityList(){
        return repo.findAll();
    }

    public String save(walletCommunityEntity entity){
        try {
             repo.save(entity);
             return "success";

        } catch (Exception e) {
            return "failure";
        }
    }

}
