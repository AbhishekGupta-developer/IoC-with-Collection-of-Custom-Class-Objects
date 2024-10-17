package com.myorganisation.iocwithcollectionofobject.model;

import java.util.Iterator;
import java.util.List;

public class Question {
    private Integer id;
    private String name;
    private List<Answer> answers;

    public Question(Integer id, String name, List<Answer> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayAllAnswers() {
        Iterator<Answer> iterator = answers.iterator();
        System.out.println("Question id: " + this.id + "\n"+ "name: " + this.name + "\n" + "answers: ");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
