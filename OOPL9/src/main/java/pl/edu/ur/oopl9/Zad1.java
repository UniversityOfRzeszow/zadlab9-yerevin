/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Arrays;

/**
 *
 * @author student
 */
public class Zad1 {

    static public void getArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i] + "  ");
        }
        for (int number : arr) {
            System.out.println("Number = " + number);
        }
        Arrays.sort(arr);
        
        System.out.println("The sorted int array is:");
        for (int number : arr) {
            System.out.println("Number = " + number);
        }
    }

}
