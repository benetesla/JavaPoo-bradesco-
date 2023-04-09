package br.com.modificadores;

public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private Cliente cliente;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {

            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

   
}
