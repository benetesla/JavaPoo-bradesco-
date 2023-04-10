package br.com.modificadores;

public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private Cliente cliente;
   

    Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    Conta(int numero, double saldo, double limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }  

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

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta conta) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            conta.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

}
