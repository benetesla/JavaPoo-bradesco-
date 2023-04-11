package br.com.heranca;

abstract class Funcionario extends SistemaInterno {
    protected String nome;
    protected String cpf;
    protected double salario;
    protected int senha;
    protected int numeroDeFuncionarios;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }
    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }
    
   abstract double getBonificacao();
    public boolean auntentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso permitido");
            return true;
        } else {
            System.out.println("Acesso negado");
            return false;
        }
    }
    public void sacar(double valor) {
      double Salario = this.getSalario();
        if (valor <= Salario) {
            Salario -= valor;
            this.setSalario(Salario);
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }        
    }
   
}
