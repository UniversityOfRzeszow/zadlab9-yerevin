/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Mateusz
 */
public class Dictionary {

    static public void getDictionary() {
        HashMap<String, String> words = new HashMap<>();
        words.put("papuga", "parrot");
        words.put("kobieta", "woman");
        words.put("mezczyna", "man");
        words.put("pies", "dog");
        words.put("jesc", "eat");
        words.put("czlowiek", "human");
        words.put("pic", "drink");
        words.put("spac", "sleep");
        words.put("bialy", "white");
        words.put("grac", "play");
        words.put("czarny", "black");
        words.put("tata", "dad");
        words.put("czerwony", "red");
        words.put("kot", "cat");
        words.put("zielony", "green");
        words.put("warzywa", "vegetables");
        words.put("owoce", "fruits");
        words.put("sklep", "shop");
        words.put("mama", "mom");
        words.put("lozko", "bed");

        Scanner input = new Scanner(System.in);
        String word = "";
        System.out.println("Wpisz jedno z podanych słów aby uzyskac tlumaczenie na jezyk angielski: "
                + "\n "
                + "papuga\n "
                + "kobieta\n "
                + "mezczyzna\n "
                + "pies\n "
                + "jesc\n "
                + "czlowiek\n "
                + "pic\n "
                + "spac\n "
                + "bialy\n "
                + "czarny\n "
                + "tata\n "
                + "czerwony\n "
                + "kot\n "
                + "zielony\n "
                + "warzywa\n "
                + "owoce\n "
                + "sklep\n "
                + "mama\n "
                + "lozko");
        while (!"koniec!".equals(word)) {
            word = input.nextLine();
            System.out.println(word + " in English that means " + words.get(word));
        }
    }

}
