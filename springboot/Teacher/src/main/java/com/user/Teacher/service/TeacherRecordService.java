package com.user.Teacher.service;

import com.user.Teacher.entities.TeacherRecord;
import com.user.Teacher.repository.TeacherRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherRecordService {

    @Autowired
    private TeacherRecordRepo teacherRecordRepo;

    //create
    public TeacherRecord createTeacher (TeacherRecord saveData){

        TeacherRecord teacherData = new TeacherRecord();
        teacherData.setTeacherName(saveData.getTeacherName());
        teacherData.setTeacherAge(saveData.getTeacherAge());
        TeacherRecord datasaved = this.teacherRecordRepo.save(teacherData);
        return  datasaved;

    }

    public TeacherRecord teacherById(int TeacherId){
        TeacherRecord teacherData = this.teacherRecordRepo.findById(TeacherId).get();
        return teacherData;
    }


    public TeacherRecord updateTeacher(int TeacherId, TeacherRecord dataUpdate){
        TeacherRecord data = this.teacherRecordRepo.findById(TeacherId).get();
        TeacherRecord newData = new TeacherRecord();
        if (data.getTeacherName()!=null){

            newData.setTeacherId(TeacherId);

            newData.setTeacherName(dataUpdate.getTeacherName());
            newData.setTeacherAge(dataUpdate.getTeacherAge());
            this.teacherRecordRepo.save(newData);
        }

        else {
            System.out.println("User with teacher id : " +TeacherId+ "not found");
        }
        return newData;
    }

    public String deleteTeacher(int TeacherId){
        this.teacherRecordRepo.deleteById(TeacherId);
        return "Teacher deleted whose id is : " +TeacherId+ "successfullyyy ";
    }

}

