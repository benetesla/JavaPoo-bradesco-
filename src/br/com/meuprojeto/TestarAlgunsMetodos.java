package br.com.meuprojeto;
public class TestarAlgunsMetodos {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumeroConta(123);
        conta.setNomeCliente("João");
        conta.setSaldo(1000);
        conta.setLimite(100);
        conta.setTipoConta("Corrente");
        System.out.println("Dados da conta: " + conta.getNumeroConta() + " " + conta.getNomeCliente() + " " + conta.getSaldo() + " " + conta.getLimite() + " " + conta.getTipoConta());
        conta.sacar(500);
        System.out.println("Saldo após saque: " + conta.getSaldo());
        conta.depositar(100);
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        Conta conta2 = new Conta();
        conta2.setNumeroConta(456);
        conta2.setNomeCliente("Maria");
        conta2.setSaldo(2000);
        conta2.setLimite(200);
        conta2.setTipoConta("Poupança");
        System.out.println("Dados da conta: " + conta2.getNumeroConta() + " " + conta2.getNomeCliente() + " " + conta2.getSaldo() + " " + conta2.getLimite() + " " + conta2.getTipoConta());
        conta2.sacar(500);
        System.out.println("Saldo após saque: " + conta2.getSaldo());
        conta2.depositar(100);
        System.out.println("Saldo após depósito: " + conta2.getSaldo());


        conta.transferir(conta2, 100);
        System.out.println("Saldo após transferência: " + conta.getSaldo());
        System.out.println("Saldo após transferência: " + conta2.getSaldo());

        conta2.transferir(conta, 400);
        System.out.println("Saldo após transferência: " + conta.getSaldo());
        System.out.println("Saldo após transferência: " + conta2.getSaldo());


    }
}
