/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author maarchyl
 */



public class Main {
    public static void main(String[] args) {

        System.out.println("ZADANIE 1 \n");
        Zad1.getArray();
        System.out.println("ZADANIE 2 \n");
        Zad2.getTreeSetArray();
        System.out.println("ZADANIE 3 \n");
        List<Samochod> lista = new ArrayList<Samochod>();
        Samochod first = new Samochod("Fiat","300p",110,52000);
        Samochod second = new Samochod("Maluch","Tem",170,125000);
        Samochod third = new Samochod("Renault","Lem",260,9000);
        Samochod fourth = new Samochod("Mercedes","cls",120,52000);
        lista.add(first);
        lista.add(second);
        lista.add(third);
        lista.add(fourth);
        for(int i = 0; i<4; i++) {
           System.out.println(lista.get(i).toString()); 
        }
        
       }
}
