package br.com.meuprojeto;
import javax.swing.JFrame;
public interface Jframe {
    
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Minha primeira janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 300);
        janela.setVisible(true);

    }
}
