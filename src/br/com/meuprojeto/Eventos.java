package br.com.meuprojeto;
import javax.swing.JFrame;
import javax.swing.Action;
public class Eventos {
    public Eventos() {
        JFrame janela = new JFrame("Eventos");
        janela.setSize(300, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        new Eventos();
    }
    
    
}
