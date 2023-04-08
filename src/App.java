

import javax.swing.JOptionPane;

import br.com.meuprojeto.Conta;

public class App {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "digite o numero da conta");
        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("digite o numero da conta"));
        JOptionPane.showMessageDialog(null, "digite o nome do cliente");
        String nomeCliente = JOptionPane.showInputDialog("digite o nome do cliente");
        JOptionPane.showMessageDialog(null, "digite o saldo");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("digite o saldo"));
        JOptionPane.showMessageDialog(null, "digite o limite");
        double limite = Double.parseDouble(JOptionPane.showInputDialog("digite o limite"));

        Conta conta = new Conta(numeroConta, nomeCliente, saldo, limite);

        JOptionPane.showMessageDialog(null, "digite o valor do saque");
        double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do saque"));
        conta.sacar(valorSaque);

        JOptionPane.showMessageDialog(null, "digite o valor do deposito");
        double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do deposito"));
        conta.depositar(valorDeposito);

        JOptionPane.showMessageDialog(null, "digite o valor da transferencia");
        double valorTransferencia = Double.parseDouble(JOptionPane.showInputDialog("digite o valor da transferencia"));
        conta.transferir(conta, valorTransferencia);

        conta.imprimir();



    }
}
