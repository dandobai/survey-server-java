package com.surver.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "member")
@Setter
@Getter
@NoArgsConstructor
public class Member {
    //MemberId,Full name,E-mail address,Is Active
    //1,Malissa Arn,MalissaArn0202@gmail.com,1
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private boolean isActive;
    @OneToMany(mappedBy = "member",
            cascade = CascadeType.PERSIST)
    private List<Participation> participations;

    public Member(String name,
                  String email,
                  boolean isActive) {
        this.name = name;
        this.email = email;
        this.isActive = isActive;
        this.participations = new ArrayList<>();
    }
}
