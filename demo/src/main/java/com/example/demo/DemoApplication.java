package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	/*
		The List interface in Java provides a way to store the ordered collection.
		It is a child interface of Collection. It is an ordered collection
		of objects in which duplicate values can be stored.
		Since List preserves the insertion order,
		it allows positional access and insertion of elements

		* Note: The List interface allow us to pass the "Student" class here
		* then we use a method that gives us access to the fields and methods
		* inside the "Student" class.
	*/
    @GetMapping
	public List<Student> hello() {
		/*
			* Note 1: Now when we run the web server, Spring Boot will convert
			* our "Student" object below that we created using the "new" keyword
			* constructor into a "JSON" object. Open your web browser, Firefox,
			* to see the results
			*
			* Note 2: This is the Student that we created in Java using Spring Boot
			* new Student(
						1L,
						"Mariam",
						"mariam.jamal@gmail.com",
						LocalDate.of(20000, Month.JANUARY, 5),
						21

				)
			* Note 3: This is the JSON object that the web server generated
			* and displayed in our web browser:
			*
			* JSON Object displayed on Firefox: [{"id":1,"name":"Mariam","email":"mariam.jamal@gmail.com","dob":"+20000-01-05","age":21}]
		 */
		return List.of(
				new Student(
						1L,
						"Mariam",
						"mariam.jamal@gmail.com", 
						LocalDate.of(20000, Month.JANUARY, 5),
						21

				)
		);
	}

}
