package com.example.bms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity(name = "shows")
public class Show extends BaseModel{
    @ManyToOne
    private Screen screen;
    @ManyToOne
    private Movie movie;
    private Data startTime;
}
