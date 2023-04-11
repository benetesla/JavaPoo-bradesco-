package br.com.heranca;

public class EmpregadoDaFaculdade {
    private String nome;
    private double salario;

     double getGastos() {
        return this.salario;
    }
    String getInfo() {
        return "Nome: " + this.nome + " Salário: " + this.salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
