package br.com.heranca;

public class ControleDeBonificacoes {
    private double soma;

    public void registra(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
        System.out.println("Bonificação do funcionário: " + boni  + " R$" );   
    }

    public double getSoma() {
        return soma;
    }
}
