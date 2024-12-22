package org.example.dvstudent.web;

import lombok.AllArgsConstructor;
import org.example.dvstudent.dto.StudentDto;
import org.example.dvstudent.service.StudentService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphQLController {

    private StudentService studentService ;

    @MutationMapping
    public StudentDto saveStudent(@Argument StudentDto avion){
        return studentService.saveStudent(avion);
    }

    @MutationMapping
    public Boolean deleteStudent(@Argument Long id){
        return studentService.deleteStudent(id);
    }


    @QueryMapping
    public List<StudentDto> getStudentbyname(@Argument String name){
        return studentService.getStudentbyname(name);
    }

    @QueryMapping
    public List<StudentDto> getStudentbynameandemail(@Argument String name, @Argument String email){
        return studentService.getStudentbynameandemail(name, email);
    }
}