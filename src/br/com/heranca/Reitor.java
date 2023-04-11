package br.com.heranca;

public class Reitor extends Funcionario implements Auntenticavel {
    private String nome;
    private double salario;
    private String curso;

    String getInfo() {
        return "Nome: " + this.nome + " Salário: " + this.salario + " Curso: " + this.curso;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    double getBonificacao() {
        return this.salario * 0.1;
    }

}
