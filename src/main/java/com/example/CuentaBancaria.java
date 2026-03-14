package com.example;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {

        this.titular = titular;

        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {

        if (cantidad > 0) {
            saldo += cantidad;
        }

    }

    public void retirar(double cantidad) {

        if (cantidad <= 0){
            System.out.println("La cantidad debe ser mayor a cero");

        }
        else if (cantidad > saldo) {
            System.out.println("Saldo insuficiente");
            
        }
        else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso");
        }
    }
}
