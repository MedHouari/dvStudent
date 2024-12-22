package org.example.dvstudent.dto;

import lombok.*;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class StudentDto {

    String nom;
    String email;
    String DateNaissance;

}