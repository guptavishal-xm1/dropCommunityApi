package com.dropearn.earndropapi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class userEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Column(name = "email",unique = true)
    private String email;
    private String password;
    private String tonWalletAddress;
    @Column(name = "level", nullable = false)
    private String level;
    private boolean newsletter;

    @PrePersist
    void preInsert(){
        if (this.level==null) this.level="bronze"; // user has three level bronze,silver,gold
    }
}
