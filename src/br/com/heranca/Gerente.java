package br.com.heranca;

public abstract class Gerente extends Funcionario  implements Auntenticavel {
    protected int senha;
    protected int numeroDeFuncionariosGerenciados;
    
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
    
    abstract double getBonificacao();

    public boolean auntentica(int senha) {
        if (this.senha != senha) {
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
