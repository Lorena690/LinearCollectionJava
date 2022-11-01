package com.estructuras;

import java.time.LocalDate;
import java.util.Date;

public class Juventud {
    private int id;
    private String name;
    private String direccion;
    private int estrato;
    private String comuna;
    private String genero;
    private String auxilio;
    private LocalDate fecha;

    public Juventud(int id, String name, String direccion, int estrato, String comuna, String genero, String auxilio, LocalDate fecha) {
        this.id = id;
        this.name = name;
        this.direccion = direccion;
        this.estrato = estrato;
        this.comuna = comuna;
        this.genero = genero;
        this.auxilio = auxilio;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAuxilio() {
        return auxilio;
    }

    public void setAuxilio(String auxilio) {
        this.auxilio = auxilio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Juventud{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estrato=" + estrato +
                ", comuna='" + comuna + '\'' +
                ", genero='" + genero + '\'' +
                ", auxilio='" + auxilio + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
