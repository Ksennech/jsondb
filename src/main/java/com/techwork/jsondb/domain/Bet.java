package com.techwork.jsondb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Bet {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    private String numbets;
    private String game;
    private String stake;
    private String returns;
    private String clientid;
    private String date;


    public Bet() {}
}