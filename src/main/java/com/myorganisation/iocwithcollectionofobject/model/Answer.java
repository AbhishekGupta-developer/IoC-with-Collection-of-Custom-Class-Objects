package com.myorganisation.iocwithcollectionofobject.model;

import java.util.Iterator;

public class Answer {
    private Integer id;
    private String answer;

    public Answer(Integer id, String answer) {
        this.id = id;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", answer='" + answer + '\'' +
                '}';
    }
}
