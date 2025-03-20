package org.example.EXERCICIO6;

public class ContaBancaria {

    public Double saldo;
    public String titular;


    public ContaBancaria(Double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;

    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    public void sacar(Double valor) {
    }
}