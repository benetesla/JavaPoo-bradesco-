package br.com.meuprojeto;

public class CastingDeTipos {
    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);
        double d = 5.5;
        float f = 15;
        float x = f + (float) d;
        System.out.println(x);
        int idade = 15;
        boolean AmigoDoDono = true;

        if (idade < 18 && !AmigoDoDono) {
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode entrar");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("i tem o valor: " + i);
        }
        int i = 0;
        while (i < 10) {
            System.out.println("i tem o valor: " + i);
            i++;
        }
        //o do while executa pelo menos uma vez
        int j = 11;
        do {
            System.out.println("j tem o valor: " + j);
            j++;
        } while (j < 10);

    }
}
