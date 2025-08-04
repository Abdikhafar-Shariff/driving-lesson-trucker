package com.abdikhafar.drivinglessontrucker;

import com.abdikhafar.drivinglessontrucker.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DrivinglessontruckerApplication {

	public static void main(String[] args) {

        SpringApplication.run(DrivinglessontruckerApplication.class, args);
	}
	@GetMapping
	public String getStudent(){
		return ("adizo");
	}

}
