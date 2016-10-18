package com.epam.testproject.dao;

import com.epam.testproject.entities.StudentsEntity;

import java.util.List;

public class StudentsDAO extends AbstractDAO {

    //Get all students with zero grunts function
    public List<StudentsEntity> getAllZeroGrunts(){
       return get("select Students from  StudentsEntity " +
                "Students left join Students.grunt where Students.grunt.cash=0");
    }
}
