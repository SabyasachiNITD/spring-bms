package com.sabyasachi.bms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Theatre extends BaseModel{
    private String name;
    private String location;
    @OneToMany
    private List<Auditorium> auditoriums;
}
