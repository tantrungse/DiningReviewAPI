package com.example.diningreviewapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "review")
public class Review {
    @Column(nullable = false, unique = true)
    private String displayName;

    @Column(nullable = false)
    private Long restaurantId;

    @Column
    private Integer peanutScore;

    @Column
    private Integer eggScore;

    @Column
    private Integer diaryScore;

    @Column
    private String commentary;

    @Enumerated(EnumType.STRING)
    private ReviewStatus status;
}
