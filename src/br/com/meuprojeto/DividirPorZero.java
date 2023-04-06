package br.com.meuprojeto;

import java.util.Scanner;

public class DividirPorZero {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Digite o primeiro número: ");
            int num1 = s.nextInt();
            System.out.println("Digite o segundo número: ");
            int num2 = s.nextInt();

            int resultado = num1 / num2;
            System.out.println("O resultado da divisão é: " + resultado);
            s.close();
        } catch (NumberFormatException e) {
            System.out.println("Digite apenas números");

        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
        } finally {
            System.out.println("Fim do programa");
        }

    }
}
