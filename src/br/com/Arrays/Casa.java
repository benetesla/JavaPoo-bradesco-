package br.com.Arrays;

public class Casa {
    private String cor;
    private int TotalDePortas;

    public Casa(String cor, int TotalDePortas) {
        this.cor = cor;
        this.TotalDePortas = TotalDePortas;
    }

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
        this.cor = s;
    }
    public void AbrirPorta() {
        this.TotalDePortas++;
    }



    public static void main(String[] args) {
        Casa c = new Casa("Azul", 0);
        c.pinta("Azul");
        c.AbrirPorta();
        c.TotalDePortas = 5;
        
        System.out.println(c.getCor() + " " + c.getTotalDePortas());



    }

}
