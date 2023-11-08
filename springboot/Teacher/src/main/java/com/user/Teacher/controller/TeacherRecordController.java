package com.user.Teacher.controller;

import com.user.Teacher.entities.TeacherRecord;
import com.user.Teacher.service.TeacherRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
@CrossOrigin("*")
public class TeacherRecordController {

    @Autowired
    private TeacherRecordService teacherRecordService;


    //create
    @PostMapping("/create")
    public TeacherRecord createTeacher(@RequestBody TeacherRecord teacherRecord){
        return this.teacherRecordService.createTeacher(teacherRecord);
    }

    //read
    @GetMapping("/getTeacher/{TeacherId}")
    public TeacherRecord getTeacherById(@PathVariable Integer TeacherId){
        return this.teacherRecordService.teacherById(TeacherId);
    }

    //update
    @PutMapping("/update/{TeacherId}")
    public TeacherRecord updateTeacherRecord(@PathVariable Integer TeacherId, @RequestBody TeacherRecord teacherRecord){
        return  this.teacherRecordService.updateTeacher(TeacherId, teacherRecord);
    }

    //delete
    @DeleteMapping("/delete/{TeacherId}")
    public String deleteTeacher (@PathVariable int TeacherId){
        return this.teacherRecordService.deleteTeacher(TeacherId);
    }
}
