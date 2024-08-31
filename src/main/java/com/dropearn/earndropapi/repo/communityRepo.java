package com.dropearn.earndropapi.repo;

import com.dropearn.earndropapi.Entity.walletCommunityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface communityRepo extends JpaRepository<walletCommunityEntity, Long> {
}
