package br.com.heranca;

public class Gerentes extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    public boolean auntentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso permitido");
            return true;
        } else {
            System.out.println("Acesso negado");
            return false;
        }
    }
}
