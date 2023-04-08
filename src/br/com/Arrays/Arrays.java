package br.com.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
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
        //linkedList

        LinkedList<String> nomes2 = new LinkedList<String>();
        nomes2.add("João");
        nomes2.add("Maria");
        nomes2.add("José");
        nomes2.add("Pedro");
        nomes2.add("Ana");

        System.out.println(nomes2);
        System.out.println("Tamanho do arraylist: " + nomes2.size());
        System.out.println("Nome na posição 2: " + nomes2.get(2));
        System.out.println("Nome na posição 3: " + nomes2.get(0));
        //removendo um nome
        nomes2.remove(0);
        System.out.println("Nome na posição 0: " + nomes2.get(0));
        //removendo todos os nomes
        nomes2.clear();
        System.out.println("Tamanho do LinkedList: " + nomes2.size());


    }
}
