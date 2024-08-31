package com.dropearn.earndropapi.repo;

import com.dropearn.earndropapi.Entity.userEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Transactional
@Repository
public interface userRepo extends JpaRepository<userEntity,Integer> {
    userEntity findByEmail(String email);
    String deleteByEmail(String email);
}
