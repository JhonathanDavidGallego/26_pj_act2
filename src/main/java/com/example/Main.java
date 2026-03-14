package com.example;

public class Main {

    public static void main(String[] args) {

        Libro l1 = new Libro();
        l1.mostrarDetalles();

        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
        l2.mostrarDetalles();

        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarDetalles();


        //cuenta Bancaria.java
        CuentaBancaria cuenta = new CuentaBancaria("Jhonnatan", 1000);

        cuenta.depositar(500);

        System.out.println(cuenta.getSaldo()); 

        cuenta.retirar(500);
        ;

        System.out.println(cuenta.getSaldo());

        // Estudiante.java

        Estudiante e = new Estudiante("Jhonathan", 37, 2.5);

        e.mostrariinfo();

    }

}
