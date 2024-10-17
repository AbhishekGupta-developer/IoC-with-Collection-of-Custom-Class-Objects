package com.myorganisation.iocwithcollectionofobject.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem {
    private Integer id;
    private String name;
    private HashMap<Integer, Answer> solutions;

    public Problem(Integer id, String name, HashMap<Integer, Answer> solutions) {
        this.id = id;
        this.name = name;
        this.solutions = solutions;
    }

    public void displayAllSolutions() {
        Iterator<Map.Entry<Integer, Answer>> iterator = solutions.entrySet().iterator();
        System.out.println("Problem id: " + this.id + "\n"+ "name: " + this.name + "\n" + "solutions: ");
        while(iterator.hasNext()) {
            Map.Entry<Integer, Answer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " & value: " + entry.getValue());
        }
    }
}
