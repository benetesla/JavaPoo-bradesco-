package br.com.meuprojeto;

public class Conta {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    private double limite;

    public Conta(int numeroConta, String nomeCliente, double saldo, double limite) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.limite = limite;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        }
    }
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void transferir(Conta contaDestino, double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
        }
    }

    public void imprimir() {
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Nome do cliente: " + this.nomeCliente);
        System.out.println("Saldo + Limite: " + (this.saldo + this.limite));

    }

}
