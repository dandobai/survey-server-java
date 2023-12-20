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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private boolean isActive;
    @OneToMany(mappedBy = "member",
            cascade = CascadeType.ALL)
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
