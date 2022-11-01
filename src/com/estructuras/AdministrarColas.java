package com.estructuras;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class AdministrarColas {

    Queue<Juventud> juventudes;

    public AdministrarColas() {
        this.juventudes = new LinkedList<>();
    }

    public void registrarJoven(Juventud joven)
    {
        juventudes.add(joven);
    }

    public void eliminarJoven()
    {
        juventudes.poll();
    }

    public int reporteConteo()
    {
        return juventudes.size();
    }

    public void mostrarCola() {
        juventudes.forEach(System.out::println);
    }
}
