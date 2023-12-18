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
    //SurveyId,Name,Expected completes,Completion points,Filtered points
    //1,Survey 01,30,5,2
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.PERSIST)
    private List<Participation> participations;
    private String name;
    private int expectedCompletes;
    private int completionPoints;
    private int filteredPoints;

    public Survey(String name,
                  int expectedCompletes,
                  int completionPoints,
                  int filteredPoints) {
        this.participations = new ArrayList<>();
        this.name = name;
        this.expectedCompletes = expectedCompletes;
        this.completionPoints = completionPoints;
        this.filteredPoints = filteredPoints;
    }
}
