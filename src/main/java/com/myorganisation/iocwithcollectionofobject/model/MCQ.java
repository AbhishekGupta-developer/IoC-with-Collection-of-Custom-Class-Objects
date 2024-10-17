package com.myorganisation.iocwithcollectionofobject.model;

import java.util.Iterator;
import java.util.Set;

public class MCQ {
    private Integer id;
    private String name;
    private Set<Answer> options;

    public MCQ(Integer id, String name, Set<Answer> options) {
        this.id = id;
        this.name = name;
        this.options = options;
    }

    public void displayAllAnswers() {
        Iterator<Answer> iterator = options.iterator();
        System.out.println("MCQ id: " + this.id + "\n"+ "name: " + this.name + "\n" + "options: ");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
