package br.com.arrays;

public class Casa {
    private String cor;
    private int TotalDePortas;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTotalDePortas() {
        return TotalDePortas;
    }

    public void setTotalDePortas(int TotalDePortas) {
        this.TotalDePortas = TotalDePortas;
    }

    public void pinta(String s) {
        System.out.println("Pintando a casa de " + s);
    }

    public void AbrirPorta() {
        System.out.println("Abrindo a porta");
    }

    public void AdicionarPorta() {
        double Portas = TotalDePortas;
        Portas = Portas + 1;
        System.out.println("Total de portas: " + Portas);
    }

    public static void main(String[] args) {
        Casa c = new Casa();
        c.pinta("Azul");
        c.AbrirPorta();
        c.setCor("Azul");
        c.setTotalDePortas(3);
        c.AdicionarPorta();
        c.AdicionarPorta();
        c.AdicionarPorta();
        c.AdicionarPorta();

        System.out.println("Cor da casa: " + c.getCor());
        System.out.println("Total de portas: " + c.getTotalDePortas() + " portas");

    }

}
