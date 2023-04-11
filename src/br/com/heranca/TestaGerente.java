package br.com.heranca;

public class TestaGerente {
    public static void main(String[] args) {
        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000);
        funcionario1.setSenha(1234);
        controle.registra(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(2000);
        controle.registra(funcionario2);
        funcionario2.setSenha(1235);

        System.out.println("Total de bonificações: " + controle.getSoma() + " R$");
        boolean autenticou = funcionario1.auntentica(1234);
        System.out.println(autenticou);
        boolean autenticou2 = funcionario2.auntentica(1235);
        System.out.println(autenticou2);
        
    }
}
