package br.com.modificadores;

public class TestaContEstouro {
    public static void main(String[] args) {   
    
        Cliente cliente = new Cliente();
        cliente.setNome("Maria");
        cliente.validaCPF("08288274510");
        cliente.setCpf("08288274510");
        cliente.setIdade(70);

        Conta conta = new Conta(cliente);       
        conta.setNumero(123);
        conta.setLimite(400);
        conta.setSaldo(2000);
        conta.setCliente(cliente);
        conta.sacar(800);
        conta.depositar(1000);
    
       
        System.out.println("Os dados da conta são: " + "Nome: " + conta.getCliente().getNome() + " CPF: "
                + conta.getCliente().getCpf() + " Idade: " + conta.getCliente().getIdade() + " Saldo: "
                + conta.getSaldo() + " Limite: " + conta.getLimite());

        
    }
}
