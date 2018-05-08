/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class Zad2 {

    static public void getTreeSetArray() {
        TreeSet<Integer> tree = new TreeSet<Integer>();
	tree.add(12);
	tree.add(63);
	tree.add(34);
	tree.add(45);
 
	Iterator<Integer> iterator = tree.iterator();
	System.out.print("Tree set data: ");
	while (iterator.hasNext()) {
		System.out.print(iterator.next() + " ");
	}
 

    }

}
