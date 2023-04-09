package br.com.modificadores;

public class TestaContEstouro {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.setNumero(451);
        c.setTitular("João");
        c.setSaldo(14000);
        c.setLimite(100);
        c.sacar(15000);
        System.out.println("Saldo: " + c.getSaldo()+ " Titular: " + c.getTitular());
    }
}
