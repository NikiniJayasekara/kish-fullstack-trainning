package com.nikini.rentacardemo.service;

import com.nikini.rentacardemo.model.Student;


public interface StudentService {


    Student save(Student student);
    public Student fetchStudentById(int id);

}