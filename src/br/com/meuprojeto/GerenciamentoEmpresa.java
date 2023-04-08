package br.com.meuprojeto;

public class GerenciamentoEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.setNome("Bene Tesla S.A.");
        empresa.setCnpj("123456789/0001-00");

        Funcionario f1 = new Funcionario();
        f1.setNome("João");
        f1.setDepartamento("TI");
        f1.setSalario(1000);
        f1.setDataEntrada("01/01/2018");
        f1.setRg("123456789");
        f1.setEstaNaEmpresa(true);
        f1.recebeAumento(200);
        

        Funcionario f2 = new Funcionario();
        f2.setNome("Maria");
        f2.setDepartamento("RH");
        f2.setSalario(2000);
        f2.setDataEntrada("01/01/2018");
        f2.setRg("987654321");
        f2.setEstaNaEmpresa(true);
        f2.recebeAumento(100);
       


        empresa.adiciona(f1);
        f1.calculaGanhoAnual();
        empresa.adiciona(f2);
        f2.calculaGanhoAnual();

    }
}
