package org.example.dvstudent.service;

import org.example.dvstudent.dto.StudentDto;

import java.util.List;


public interface StudentService {

    public StudentDto saveStudent(StudentDto studentDto);

    public boolean deleteStudent(Long id_Student);

    public List<StudentDto> getStudentbyname(String name);

    public List<StudentDto> getStudentbynameandemail(String name, String email);

    public List<StudentDto> saveStudent(List<StudentDto> studentDtos);

}