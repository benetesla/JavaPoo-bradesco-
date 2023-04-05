package br.com.meuprojeto;

public class Animal {
    protected static String nome;
    protected static String raca;
    protected static int idade;

    public Animal(String nome, String raca, int idade) {
        Animal.nome = nome;
        Animal.raca = raca;
        Animal.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Animal.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        Animal.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        Animal.idade = idade;
    }

    @Override
    public String toString() {
        return "Animal [idade=" + idade + ", nome=" + nome + ", raca=" + raca + "]";
    }
}
