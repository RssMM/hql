package com.example.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Profesor {
    @Id
    private Long idProfesor;

    @Column
    private String nombre;

    public Profesor(){}


}