package br.com.meuprojeto;

public class TestarAlgunsMetodos {
    public static void main(String[] args) {
        Conta conta = new Conta(123, "João", 1200, 500);
        System.out.println("NOME: " + conta.getNomeCliente());
        System.out.println("SALDO: " + conta.getSaldo());
        conta.sacar(100);
        System.out.println("SALDO: " + conta.getSaldo());
        conta.depositar(100);
        System.out.println("SALDO: " + conta.getSaldo());
        Conta conta2 = new Conta(456, "Maria", 1000, 500);
        System.out.println("NOME: " + conta2.getNomeCliente());
        System.out.println("SALDO: " + conta2.getSaldo());
        conta2.sacar(12000);
        System.out.println("SALDO: " + conta2.getSaldo());
        conta2.depositar(100);
        System.out.println("SALDO: " + conta2.getSaldo());
        conta.transferir(conta2, 100);
        System.out.println("Transferência de 100 reais da conta 123 para a conta 456");
        System.out.println("SALDO: " + conta.getSaldo());
        conta2.transferir(conta, 100);
        System.out.println("Transferência de 100 reais da conta 456 para a conta 123");
        System.out.println("SALDO 1 \n: " + conta2.getSaldo());
        // saldo de de todas as contas
        System.out.println("SALDO 2 \n: " + conta.getSaldo());
       
    }
}
