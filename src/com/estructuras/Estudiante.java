package com.estructuras;

import java.time.LocalDate;
import java.util.Date;

public class Estudiante {

    private String tipoId;
    private int id;
    private String nombre;
    private int edad;
    private int estrato;
    private LocalDate fecha;
    private Boolean votacion;


    public Estudiante(String tipoId, int id, String nombre, int edad, int estrato, LocalDate fecha, Boolean votacion) {
        this.tipoId = tipoId;
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.estrato = estrato;
        this.fecha = fecha;
        this.votacion = votacion;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Boolean getVotacion() {
        return votacion;
    }

    public void setVotacion(Boolean votacion) {
        this.votacion = votacion;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "tipoId='" + tipoId + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estrato=" + estrato +
                ", fecha=" + fecha +
                ", votacion=" + votacion +
                '}';
    }
}
