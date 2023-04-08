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
        conta2.sacar(40);
       
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
       
        Conta conta3 = new Conta( 789, "José", 500, 500);    
        System.out.println("NOME: " + conta3.getNomeCliente());
        System.out.println("SALDO: " + conta3.getSaldo());
        conta3.sacar(100);
        System.out.println("SALDO: " + conta3.getSaldo());
        conta3.depositar(100);
        System.out.println("SALDO: " + conta3.getSaldo());
        conta3.transferir(conta2, 100);
        Conta conta4 = new Conta( 101, "Ana", 500, 500);
        System.out.println("NOME: " + conta4.getNomeCliente());
        System.out.println("SALDO: " + conta4.getSaldo());
        conta4.sacar(100);
        System.out.println("SALDO: " + conta4.getSaldo());
        conta4.depositar(100);
        System.out.println("SALDO: " + conta4.getSaldo());
        conta4.transferir(conta3, 100);

        //saldo final
        conta.SaldoFinal();
        conta2.SaldoFinal();
        conta3.SaldoFinal();
        conta4.SaldoFinal();


    }
}
