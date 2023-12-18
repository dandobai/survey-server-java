package com.surver.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "status")
@Setter
@Getter
@NoArgsConstructor
public class Status {
    @Id
    @SequenceGenerator(name = "seqGen",
            sequenceName = "SEQ",
            initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "seqGen")
    private int id;
    private String message;
    @OneToMany(mappedBy = "status",
            cascade = CascadeType.PERSIST)
    private List<Participation> participations;

    public Status(String message) {
        this.message = message;
        this.participations = new ArrayList<>();
    }
}
