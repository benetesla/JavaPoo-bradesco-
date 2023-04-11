package br.com.heranca;

public class SistemaInterno {
    void Login(Funcionario f, int senha) {
        boolean autenticou = f.auntentica(senha);
        if (autenticou) {
            System.out.println("Bem vindo ao sistema");
        } else {
            System.out.println("Acesso negado");
        }
    }
}