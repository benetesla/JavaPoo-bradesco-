package br.com.heranca;

public class GeradorDeRelatorio {
    public void adiciona(EmpregadoDaFaculdade empregado) {
        System.out.println(empregado.getInfo());
        System.out.println("Gasto com salário: " + empregado.getGastos());
        System.out.println("-------------------------------");
    }
}
