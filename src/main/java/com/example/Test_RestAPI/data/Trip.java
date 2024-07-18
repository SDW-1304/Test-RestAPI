package com.example.Test_RestAPI.data;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="company")
    private int company;

    @Column(name="plane")
    private String plane;

    @Column(name="town_from")
    private String town_from;

    @Column(name="town_to")
    private String town_to;

    @Column(name="time_out")
    private Date time_out;

    @Column(name="time_in")
    private Date time_in;

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL)
    private List<Company> companies;

    public Trip(long id, int company, String plane, String town_from, String town_to, Date time_out, Date time_in) {
        this.id = id;
        this.company = company;
        this.plane = plane;
        this.town_from = town_from;
        this.town_to = town_to;
        this.time_out = time_out;
        this.time_in = time_in;
    }
}
