package br.com.modificadores;

public class TestaContEstouro {
    public static void main(String[] args) {
      
        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.validaCPF("12345678145");
        cliente.setCpf("12345678145");
        cliente.setIdade(20);

        Conta conta = new Conta(cliente);
        conta.setNumero(123);
        conta.setLimite(400);
        conta.setSaldo(2000);
        conta.setCliente(cliente);

        conta.sacar(800);
        conta.depositar(1000);
        //conta.transferir(1000, conta);

        System.out.println("Os dados da conta são: " + "Nome: " + conta.getCliente().getNome() + " CPF: " + conta.getCliente().getCpf() + " Idade: " + conta.getCliente().getIdade() + " Saldo: " + conta.getSaldo() + " Limite: " + conta.getLimite());
    }
}
