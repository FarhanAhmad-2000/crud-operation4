package com.user.Teacher.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int TeacherId;

    @Column(name = "TeacherName", length = 20)
    private String TeacherName;


    @Column(name = "TeacherAge")
    private int TeacherAge;

}
