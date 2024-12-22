package org.example.dvstudent.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Student {
    @Id
    @GeneratedValue
    Long id_Student;
    String nom;
    String email;
    String DateNaissance;

}


