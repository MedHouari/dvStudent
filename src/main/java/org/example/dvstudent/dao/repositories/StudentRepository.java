package org.example.dvstudent.dao.repositories;

import org.example.dvstudent.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student> findByname(String nom);

    public List<Student> findBynameandemail(String nom, String email);
}
