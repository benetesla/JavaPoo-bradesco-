package br.com.meuprojeto;

public class Gato  extends Animal{
    private int HabilidadeDePular;
    private int habitos;

    public Gato() {
        super(nome, raca, idade);
    }

    public void miar() {
        System.out.println("Miau");
    }
    public int getHabilidadeDePular() {
        return HabilidadeDePular;
    }
    public void setHabilidadeDePular(int HabilidadeDePular) {
        this.HabilidadeDePular = HabilidadeDePular;
    }
    public int getHabitos() {
        return habitos;
    }
    public void setHabitos(int habitos) {
        this.habitos = habitos;
    }
    public void correr() {
        System.out.println("Correndo");
    }
    @Override
    public String toString() {
        return "Gato [HabilidadeDePular=" + HabilidadeDePular + ", habitos=" + habitos + "]";
    }
}
    

