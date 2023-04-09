package br.com.modificadores;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void mudaCpf(String cpf) {
        if (this.idade <= 60) {
            validaCPF(cpf);
        }
        this.cpf = cpf;
    }
    public void validaCPF(String cpf) {
        if (cpf.length() != 11) {
            System.out.println("CPF inválido");
        }
    }
}
