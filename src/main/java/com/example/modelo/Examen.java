package com.example.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Examen {
    @Id
    private long idExamen;

    @Column
    private String fecha;

    @Column
    private double nota;

    @Column
    private double idAlumno;

    @Column
    private double idModul;

    public Examen(){}
}