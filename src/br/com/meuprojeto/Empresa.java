package br.com.meuprojeto;

public class Empresa {
    private String nome;
    private String cnpj;
    


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void adiciona(Funcionario f) {
        System.out.println("Adicionando funcionário: " + "\n" + f.getNome() + "\n" + f.getDepartamento() + "\n" + f.getSalario() +"\n" + f.getDataEntrada() + "\n" + f.getRg() + "\n" + f.isEstaNaEmpresa());
    }


    

}
