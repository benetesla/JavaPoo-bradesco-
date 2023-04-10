package br.com.heranca;
public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Marcos");
        gerente.setSenha(4854);
        gerente.setSalario(5000.0);
       
        System.out.println(gerente.getNome() + " " + gerente.getSalario());
        boolean autenticou = gerente.auntentica(4854);
        System.out.println(autenticou);
    }
}
