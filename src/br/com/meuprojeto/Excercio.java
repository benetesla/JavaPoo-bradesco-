package br.com.meuprojeto;

public class Excercio {
    public static void main(String[] args) {
        int i = 150;
        while (i <= 300) {
            System.out.println(i);
            i++;
        }
        for (int j = 150; j <= 300; j++) {
            System.out.println(j);
        }

        //multiplos de 3
        for (int k = 1; k <= 100; k++) {
            if (k % 3 == 0) {
                System.out.println(k);
            }
        }
        //fatores de 1 a 10
        for (int l = 1; l <= 10; l++) {
            System.out.println("Fatores de " + l);
            for (int m = 1; m <= l; m++) {
                if (l % m == 0) {
                    System.out.println(m);
                }
            }
        }

        //fibonacci

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        System.out.println(n1);
        System.out.println(n2);
        for (int n = 0; n < 10; n++) {
            n3 = n1 + n2;
            System.out.println("A sequencia de fibonacci é: " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
