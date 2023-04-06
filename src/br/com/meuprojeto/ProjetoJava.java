package br.com.meuprojeto;
import javax.swing.JOptionPane;
public class ProjetoJava {
    
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
            int resultado = num1 / num2;
            JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Não é possível dividir por zero");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        } finally {
            JOptionPane.showMessageDialog(null, "Fim do programa");
        }
    }
}
