package com.estructuras;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        AdministrarCDT administrarCDT = new AdministrarCDT();
        Cdt cdt1 = new Cdt(1, 1234, 5, "Lorena", "Calle 14 Diagonal 20 - 11", 3, "Comercial", 12, 100000.0, 12000.0, LocalDate.of(2021,Month.JUNE, 9));
        Cdt cdt2 = new Cdt(2, 3456, 4, "Héctor", "Carrera 25 # 20 - 16", 5, "Residencial", 36, 300000.0, 120000.0, LocalDate.of(2019,Month.MARCH, 25));
        Cdt cdt3 = new Cdt(3, 1245, 12, "Fabio", "Calle 21 Diagonal 16 - 05", 1, "Propia", 15, 10000.0, 5000.0, LocalDate.of(2022,Month.SEPTEMBER, 14));

        administrarCDT.registrar(cdt1);
        administrarCDT.registrar(cdt2);
        administrarCDT.registrar(cdt3);

        administrarCDT.mostrarPila();

        System.out.println("El valor total es: " + administrarCDT.reporte());

        administrarCDT.eliminar();

        System.out.println("\"");

        administrarCDT.mostrarPila();

        System.out.println("\"");

        AdministrarColas administrarColas = new AdministrarColas();
        Juventud joven1 = new Juventud(1234, "Lorena", "Calle 14 Diagonal 20 - 11\"", 3, "10", "Femenino", "100000",LocalDate.of(2021,Month.JUNE, 9));
        Juventud joven2 = new Juventud(3456, "Héctor", "Carrera 25 # 20 - 16\"", 5, "8", "Masculino", "120000",LocalDate.of(2019,Month.MARCH, 25));
        Juventud joven3 = new Juventud(1245, "Fabio", "Calle 21 Diagonal 16 - 05\"", 1, "6", "Masculino", "200000",LocalDate.of(2022,Month.SEPTEMBER, 14));

        administrarColas.registrarJoven(joven1);
        administrarColas.registrarJoven(joven2);
        administrarColas.registrarJoven(joven3);

        administrarColas.mostrarCola();

        System.out.println("El valor del conteo es: " + administrarColas.reporteConteo());

        administrarColas.eliminarJoven();

        System.out.println("\"");

        administrarColas.mostrarCola();

        System.out.println("\"");

        AdministrarLista administrarLista = new AdministrarLista();

        Estudiante estudiante1 = new Estudiante("CC", 1234, "Lorena", 32, 3, LocalDate.of(2021,Month.JUNE, 9), Boolean.TRUE);
        Estudiante estudiante2 = new Estudiante("CC", 3456, "Héctor", 27, 5, LocalDate.of(2019,Month.MARCH, 25), Boolean.FALSE);
        Estudiante estudiante3 = new Estudiante("CC", 1245, "Fabio", 30, 1, LocalDate.of(2022,Month.SEPTEMBER, 14), Boolean.FALSE);

        administrarLista.registrarEstudiante(estudiante1);
        administrarLista.registrarEstudiante(estudiante2);
        administrarLista.registrarEstudiante(estudiante3);

        administrarLista.mostrarLista();

        System.out.println("\"");

        System.out.println("El estudiante está registrado: " + administrarLista.estudianteRegistrado(1234));
        System.out.println("El estudiante está registrado: " + administrarLista.estudianteRegistrado(3456));
        System.out.println("El estudiante está registrado: " + administrarLista.estudianteRegistrado(1245));
        System.out.println("El estudiante está registrado: " + administrarLista.estudianteRegistrado(8956));

        administrarLista.eliminarEstudiante(3456);

        System.out.println("\"");

        administrarLista.mostrarLista();
    }

}