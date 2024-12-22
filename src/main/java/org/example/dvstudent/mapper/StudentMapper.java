package org.example.dvstudent.mapper;

import org.springframework.stereotype.Component;
import org.example.dvstudent.dao.entities.Student;
import org.example.dvstudent.dto.StudentDto;
import org.modelmapper.ModelMapper;


@Component
public class StudentMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Student fromStudentDtoToStudent(StudentDto StudentDto) {
        return mapper.map(StudentDto, Student.class);
    }

    public StudentDto fromStudenttoStudentDto(Student student){
        return mapper.map(student, StudentDto.class);
    }

}
