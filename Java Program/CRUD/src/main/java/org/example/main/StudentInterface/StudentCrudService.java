package org.example.main.StudentInterface;

import org.example.main.StudentModel.Student;

import java.util.ArrayList;

public interface StudentCrudService {
    void operate();
    ArrayList<Student> list=new ArrayList<Student>();
}
