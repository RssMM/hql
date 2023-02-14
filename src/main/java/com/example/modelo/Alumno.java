package com.example.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Alumno {
    @Id
    private long idAlumno;

    @Column
    private String apellidos;

    @Column
    private int edad;

    @Column
    private String nombre;

    @Column
    private String repetidor;

    public Alumno(){}
}