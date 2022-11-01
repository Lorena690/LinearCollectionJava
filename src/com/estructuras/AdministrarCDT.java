package com.estructuras;

import java.util.Stack;

public class AdministrarCDT {
    public Stack<Cdt> pilaCdtStack;

    public AdministrarCDT() {
        this.pilaCdtStack = new Stack<>();
    }

    public void registrar(Cdt cdt) {
        pilaCdtStack.push(cdt);
    }

    public void eliminar() {
        pilaCdtStack.pop();
    }

    public Double reporte() {
        double sumaTotales = (double) 0;
        for (Cdt pilaCdt:pilaCdtStack) {
            sumaTotales = sumaTotales + pilaCdt.getTotal();
        }
        return sumaTotales;
    }

    public void mostrarPila() {
        pilaCdtStack.forEach(System.out::println);
    }
}
