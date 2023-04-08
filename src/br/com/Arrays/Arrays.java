package br.com.Arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arrays {
    public static void main(String[] args) {
        // usando o arraylist
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("José");
        nomes.add("Pedro");
        nomes.add("Ana");
        // imprimindo o arraylist
        System.out.println(nomes);
        System.out.println("Tamanho do arraylist: " + nomes.size());
        System.out.println("Nome na posição 2: " + nomes.get(2));
        System.out.println("Nome na posição 3: " + nomes.get(0));
        // removendo um nome
        nomes.remove(0);
        System.out.println("Nome na posição 0: " + nomes.get(0));
        // removendo todos os nomes
        nomes.clear();
        System.out.println("Tamanho do arraylist: " + nomes.size());
        // linkedList

        LinkedList<String> nomes2 = new LinkedList<String>();
        nomes2.add("Paula");
        nomes2.add("Roberta");
        nomes2.add("Leticia");
        nomes2.add("Mateus");
        nomes2.add("Dayane");
        // imprimindo o arraylists
        System.out.println(nomes2);
        //percorrendo o arraylist com for
        for (int i = 0; i < nomes2.size(); i++) {
            System.out.println("Nome na posição " + i + ": " + nomes2.get(i));
        }
        //percorrendo o arraylist com for each

        for (String nome : nomes2) {
            System.out.println("Nome: " + nome);
        }
        // removendo um nome
        nomes2.remove(0);
        System.out.println("Nome na posição 0: " + nomes2.get(0));
        // removendo todos os nomes
        nomes2.clear();
        System.out.println("Tamanho do LinkedList: " + nomes2.size());
    }
}
