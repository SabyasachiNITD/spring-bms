package com.sabyasachi.bms.models;

import com.sabyasachi.bms.models.constants.MovieFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Movie extends BaseModel{
    private String title;
    private String language;
    @ManyToMany
    private List<Actor> cast;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures;
}
