package com.example.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {


		ApplicationContext con = SpringApplication.run(MyAppApplication.class, args);

		Dev obj = con.getBean(Dev.class);
		obj.build();
	}

}
