package com.sabyasachi.bms.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class City extends BaseModel{
    @Column(name = "CityName")
    private String name;
    @OneToMany
    private List<Theatre> theatres;
}
