package com.example.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Modulo {

    @Id
    private long idModulo;

    @Column
    private String nombre;

    public Modulo(){}
}