package com.myorganisation.iocwithcollectionofobject;

import com.myorganisation.iocwithcollectionofobject.model.MCQ;
import com.myorganisation.iocwithcollectionofobject.model.Problem;
import com.myorganisation.iocwithcollectionofobject.model.Question;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocwithcollectionofobjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocwithcollectionofobjectApplication.class, args);

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("App.xml");

		Question question = (Question) applicationContext.getBean("question");
		question.displayAllAnswers();

		System.out.println("==========================================================");

		MCQ mcq = (MCQ) applicationContext.getBean("mcq");
		mcq.displayAllAnswers();

		System.out.println("==========================================================");

		Problem problem = (Problem) applicationContext.getBean("problem");
		problem.displayAllSolutions();

	}

}
