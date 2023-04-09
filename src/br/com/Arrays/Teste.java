package br.com.Arrays;

public class Teste {
    public static void main(String[] args) {
        // fibonacci com arrays
        int[] array = new int[12];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posição " + i + ": " + array[i]);
        }

    }
}
