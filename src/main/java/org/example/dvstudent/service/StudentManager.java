package org.example.dvstudent.service;

import lombok.AllArgsConstructor;
import org.example.dvstudent.dao.entities.Student;
import org.example.dvstudent.dao.repositories.StudentRepository;
import org.example.dvstudent.dto.StudentDto;
import org.example.dvstudent.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService {

    private StudentRepository studentRepository;
    private StudentMapper studentMapper;

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        Student student = studentMapper.fromStudentDtoToStudent(studentDto);
        student = studentRepository.save(student);
        studentDto = studentMapper.fromStudenttoStudentDto(student);
        return studentDto;
    }

    @Override
    public boolean deleteStudent(Long id) {
        try {
            studentRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<StudentDto> getStudentbyname(String name) {
        List<Student> students = studentRepository.findByname(name);
        List<StudentDto> studentDtos = new ArrayList<>();
        for (Student student : students) {
            studentDtos.add(studentMapper.fromStudenttoStudentDto(student));
        }
        return studentDtos;
    }

    @Override
    public List<StudentDto> getStudentbynameandemail(String name, String email) {
        List<Student> students = studentRepository.findBynameandemail(name, email);
        List<StudentDto> studentDtos = new ArrayList<>();
        for (Student student : students) {
            studentDtos.add(studentMapper.fromStudenttoStudentDto(student));
        }
        return studentDtos;
    }

    @Override
    public List<StudentDto> saveStudent(List<StudentDto> studentDtos) {
        List<Student> students = new ArrayList<>();
        for (StudentDto studentDto : studentDtos) {
            students.add(studentMapper.fromStudentDtoToStudent(studentDto));
        }

        students = studentRepository.saveAll(students);

        studentDtos = new ArrayList<>();
        for (Student student : students) {
            studentDtos.add(studentMapper.fromStudenttoStudentDto(student));
        }
        return studentDtos;
    }
}