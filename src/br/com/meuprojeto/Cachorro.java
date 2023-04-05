package br.com.meuprojeto;

public class Cachorro  extends Animal{
    private int quantidadeDePatas;

    public Cachorro() {
        super(nome, raca, idade);
    }

    public void latir() {
        System.out.println("Au au au");
    }
    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }
    public void setQuantidadeDePatas(int quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }
    public void correr() {
        System.out.println("Correndo");
    }
    @Override
    public String toString() {
        return "Cachorro [quantidadeDePatas=" + quantidadeDePatas + "]";
    }

}
