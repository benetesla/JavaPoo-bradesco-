package br.com.heranca;

public class TestaGerente {
    public static void main(String[] args) {
        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        Gerente g1 = new Gerente() {
            @Override
            double getBonificacao() {
                return  + 1000;
            }
        };
        g1.setNome("Marcos");
        g1.setSalario(5000.0);
        g1.setSenha(1234);
        controle.registra(g1);
        g1.Login(g1, 1234);
        boolean autenticou = g1.auntentica(1234);
        System.out.println("Autenticou: " + autenticou);       
        System.out.println("Dados do Gerente: " + g1.getNome() + " " + g1.getSalario() + " " + g1.getBonificacao());
        Funcionario f1 = new Funcionario() {
            @Override
            double getBonificacao() {
                return + 100;
            }
        };
        f1.setNome("João"); 
        f1.setSalario(2000.0);
        f1.setSenha(12568);        
        controle.registra(f1);
        f1.Login(f1, 12568);
        boolean autenticou2 = f1.auntentica(12568);
        System.out.println("Autenticou: " + autenticou2);        
        System.out.println("Dados do Funcionário: " + f1.getNome() + " " + f1.getSalario() + " " + f1.getBonificacao());
        System.out.println("Total de bonificações: " + controle.getSoma() + " R$");
    }
}
