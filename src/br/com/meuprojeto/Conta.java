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
    
    public Conta() {
        this.numeroConta = 0;
        this.nomeCliente = "";
        this.saldo = 0;
        this.limite = 0;
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

    boolean sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            double saque = this.saldo - valor;
            this.saldo = saque;
            return true;
        }
    }
    public void depositar(double valor) {
        double deposito = this.saldo + valor;
        this.saldo = deposito;
    }

    boolean transferir(Conta contaDestino, double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            double transferencia = this.saldo - valor;
            this.saldo = transferencia;
            double transferencia2 = contaDestino.getSaldo() + valor;
            contaDestino.setSaldo(transferencia2);
            System.out.println("Transferência de " + valor + " reais da conta " + this.numeroConta + " para a conta " + contaDestino.getNumeroConta());
            return true;
        }
    }

    public void SaldoFinal() {
        double saldoFinal = this.saldo;
        System.out.println("Saldo final: " + saldoFinal);
    }
    

}
