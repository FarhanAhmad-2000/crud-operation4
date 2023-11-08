package com.user.Teacher.repository;

import com.user.Teacher.entities.TeacherRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRecordRepo extends JpaRepository<TeacherRecord, Integer> {
}
