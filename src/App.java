import javax.swing.JOptionPane;
import br.com.meuprojeto.Conta;
public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumeroConta(123);      
        conta.setSaldo(1200);
        conta.setLimite(500);
        conta.setNomeCliente("João");

        JOptionPane.showMessageDialog(null, "NOME: " + conta.getNomeCliente());
        JOptionPane.showMessageDialog(null, "SALDO: " + conta.getSaldo());
        conta.sacar(100);
        JOptionPane.showMessageDialog(null, "SALDO: " + conta.getSaldo());
        conta.depositar(100);
        JOptionPane.showMessageDialog(null, "SALDO: " + conta.getSaldo());
        
        Conta conta2 = new Conta();     
        conta2.setNumeroConta(456);
        conta2.setSaldo(1000);
        conta2.setLimite(500);
        conta2.setNomeCliente("Maria");

        JOptionPane.showMessageDialog(null, "NOME: " + conta2.getNomeCliente());
        JOptionPane.showMessageDialog(null, "SALDO: " + conta2.getSaldo());
        conta2.sacar(100);
        JOptionPane.showMessageDialog(null, "SALDO: " + conta2.getSaldo());
        conta2.depositar(100);
        JOptionPane.showMessageDialog(null, "SALDO: " + conta2.getSaldo());

        conta.transferir(conta2, 100);
        JOptionPane.showMessageDialog(null, "Transferência de 100 reais da conta 123 para a conta 456");
        JOptionPane.showMessageDialog(null, "SALDO: " + conta.getSaldo());

        conta2.transferir(conta, 100);
        JOptionPane.showMessageDialog(null, "Transferência de 100 reais da conta 456 para a conta 123");
        JOptionPane.showMessageDialog(null, "SALDO: " + conta2.getSaldo());

        //saldo de de todas as contas
        JOptionPane.showMessageDialog(null, "SALDO: " + conta.getSaldo());
         

   
    }
}
