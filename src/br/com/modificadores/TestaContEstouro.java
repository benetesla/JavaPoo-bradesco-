package br.com.modificadores;

public class TestaContEstouro {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.validaCPF("12345678145");
        cliente.setCpf("12345678145");
        cliente.setIdade(20);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");
        cliente.validaCPF("08288274510");
        cliente2.setCpf("08288274510");
        cliente2.setIdade(70);

        Conta conta = new Conta(cliente);       
        conta.setNumero(123);
        conta.setLimite(400);
        conta.setSaldo(2000);
        conta.setCliente(cliente);
        conta.sacar(800);
        conta.depositar(1000);

        Conta conta2 = new Conta(cliente2);        
        conta2.setNumero(456);
        conta2.setLimite(400);
        conta2.setSaldo(2000);
        conta2.setCliente(cliente2);
        conta2.sacar(800);
        conta2.depositar(1000);
        conta2.transferir(80, conta);
       
        System.out.println("Os dados da conta são: " + "Nome: " + conta.getCliente().getNome() + " CPF: "
                + conta.getCliente().getCpf() + " Idade: " + conta.getCliente().getIdade() + " Saldo: "
                + conta.getSaldo() + " Limite: " + conta.getLimite());
        System.out.println("Os dados da conta2 são: " + "Nome: " + conta2.getCliente().getNome() + " CPF: "
                + conta2.getCliente().getCpf() + " Idade: " + conta2.getCliente().getIdade() + " Saldo: "
                + conta2.getSaldo() + " Limite: " + conta2.getLimite());
        
    }
}
