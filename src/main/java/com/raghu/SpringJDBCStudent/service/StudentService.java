package com.raghu.SpringJDBCStudent.service;

import com.raghu.SpringJDBCStudent.model.Student;
import com.raghu.SpringJDBCStudent.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private Student stud;
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    public Student getStud() {
        return stud;
    }

    @Autowired
    public void setStud(Student stud) {
        this.stud = stud;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
        repo.save(s);
    }

    public List<Student> findAll() {
        List<Student> students = repo.findAll();
        return students;
    }
}
