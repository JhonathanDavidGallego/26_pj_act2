package com.example;

public class Estudiante {

    private String nombre;
    private int edad;
    private double promedio;

    //Contructor vacio
    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    //Getters
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
        if (edad > 0) {
            this.edad = edad;

        } else {
            System.out.println("La edad debe ser mayor que 0");
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromerio(double promedio) {
        this.promedio = promedio;
    }

    public boolean haAprobado() {
        return promedio >= 3.0;

    }

    public void mostrariinfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);

        if (haAprobado()) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }

}
