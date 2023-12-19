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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    @OneToMany(mappedBy = "status",
            cascade = CascadeType.ALL)
    private List<Participation> participations;

    public Status(String message) {
        this.message = message;
        this.participations = new ArrayList<>();
    }
}
