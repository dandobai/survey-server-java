package com.surver.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "participation")
@Setter
@Getter
@NoArgsConstructor
public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Member member;
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Survey survey;
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Status status;
    private int length;

    public Participation(Member member,
                         Survey survey,
                         Status status,
                         int length) {
        this.member = member;
        this.survey = survey;
        this.status = status;
        this.length = length;
    }
}
