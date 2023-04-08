package br.com.Arrays;
import java.util.ArrayList;
public class Arrays {
    public static void main(String[] args) {
        //usando o arraylist
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("José");
        nomes.add("Pedro");
        nomes.add("Ana");

        //imprimindo o arraylist
        System.out.println(nomes);
        System.out.println("Tamanho do arraylist: " + nomes.size());
        System.out.println("Nome na posição 2: " + nomes.get(2));
        System.out.println("Nome na posição 3: " + nomes.get(0));

        //removendo um nome

        nomes.remove(0);
        System.out.println("Nome na posição 0: " + nomes.get(0));

        //removendo todos os nomes
        nomes.clear();
        System.out.println("Tamanho do arraylist: " + nomes.size());
    }
}
