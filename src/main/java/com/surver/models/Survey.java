package com.surver.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "survey")
@Setter
@Getter
@NoArgsConstructor
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Participation> participations;
    private String name;
    private int expectedCompletes;
    private int completionPoints;
    private int filteredPoints;

    public Survey(String name,
                  int expectedCompletes,
                  int completionPoints,
                  int filteredPoints) {
        this.participations = new ArrayList<Participation>();
        this.name = name;
        this.expectedCompletes = expectedCompletes;
        this.completionPoints = completionPoints;
        this.filteredPoints = filteredPoints;
    }
}
