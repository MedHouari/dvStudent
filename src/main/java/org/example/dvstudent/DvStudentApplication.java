package org.example.dvstudent;

import org.example.dvstudent.dto.StudentDto;
import org.example.dvstudent.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
@SpringBootApplication

public class DvStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DvStudentApplication.class, args);
	}

	@Bean
	CommandLineRunner start(StudentService studentService){
		return  args -> {
			studentService.saveStudent(
					List.of(
							StudentDto.builder().nom("Mohamed").email("med@gmail.com").DateNaissance("2024-12-2").build(),
							StudentDto.builder().nom("Imad").email("imad@gmail.com").DateNaissance("2024-12-22").build(),
							StudentDto.builder().nom("Hayat").email("hayat@gmail.com").DateNaissance("2024-12-22").build(),
							StudentDto.builder().nom("Marwan").email("Marwan@gmail.com").DateNaissance("2024-12-22").build()
					)

			);
		};
	}
}
