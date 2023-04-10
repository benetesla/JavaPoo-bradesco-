package br.com.heranca;

public class TestaGerente {
    public static void main(String[] args) {
        Gerentes gerente = new Gerentes();
        gerente.setNome("Marcos");
        gerente.setSenha(4854);

        boolean autenticou = gerente.auntentica(4854);sss
        System.out.println(autenticou);
    }
}
