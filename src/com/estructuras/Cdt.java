package com.estructuras;

import java.time.LocalDate;


public class Cdt {

    private int cdt;
    private int id;
    private int apertura;
    private String nombre;
    private String direccion;
    private int estrato;
    private String categoria;
    private int tiempoEnMeses;
    private Double valor;
    private Double total;
    private LocalDate fechaPago;


    public Cdt(int cdt, int id, int apertura, String nombre, String direccion, int estrato, String categoria, int tiempoEnMeses, Double valor, Double total, LocalDate fechaPago) {
        this.cdt = cdt;
        this.id = id;
        this.apertura = apertura;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estrato = estrato;
        this.categoria = categoria;
        this.tiempoEnMeses = tiempoEnMeses;
        this.valor = valor;
        this.total = total;
        this.fechaPago = fechaPago;
    }

    public int getCdt() {
        return cdt;
    }

    public void setCdt(int cdt) {
        this.cdt = cdt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApertura() {
        return apertura;
    }

    public void setApertura(int apertura) {
        this.apertura = apertura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTiempoEnMeses() {
        return tiempoEnMeses;
    }

    public void setTiempoEnMeses(int tiempoEnMeses) {
        this.tiempoEnMeses = tiempoEnMeses;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Override
    public String toString() {
        return "Cdt{" +
                "cdt=" + cdt +
                ", id=" + id +
                ", apertura=" + apertura +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estrato=" + estrato +
                ", categoria='" + categoria + '\'' +
                ", tiempoEnMeses=" + tiempoEnMeses +
                ", valor=" + valor +
                ", total=" + total +
                ", fechaPago=" + fechaPago +
                '}';
    }
}
