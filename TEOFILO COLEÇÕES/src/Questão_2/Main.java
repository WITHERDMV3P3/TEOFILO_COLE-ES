package Questão_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       
        List<Integer> numeros = new ArrayList<>();

        
        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        numeros.add(1);
        numeros.add(7);

       
        System.out.println("Números na lista:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        
        Collections.sort(numeros);

        
        System.out.println("\nLista ordenada:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
