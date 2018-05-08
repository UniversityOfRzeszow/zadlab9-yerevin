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
 * @author student
 */
public class GenericList<T> {

    List<T> list = new ArrayList<T>();

    public GenericList() {

    }

    public void populate(T t) {
        list.add(t);
    }

    Iterator<Integer> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
