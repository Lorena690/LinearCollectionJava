package com.estructuras;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AdministrarLista {

    private List<Estudiante> estudiantes;

    public AdministrarLista()
    {
        this.estudiantes = new ArrayList<Estudiante>();
    }

    public void registrarEstudiante(Estudiante estudiante)
    {
        estudiantes.add(estudiante);
    }

    public void eliminarEstudiante(int idEstudiante)
    {
        estudiantes = estudiantes.stream().filter(estudiante -> estudiante.getId() != idEstudiante).collect(Collectors.toList());
    }

    public Boolean estudianteRegistrado(int idEstudiante)
    {
        Estudiante auxEstudiante = estudiantes.stream().filter(estudiante -> estudiante.getId() == idEstudiante).findFirst().orElse(null);
        return auxEstudiante != null;
    }
    public void mostrarLista() {
        estudiantes.forEach(System.out::println);
    }
}
