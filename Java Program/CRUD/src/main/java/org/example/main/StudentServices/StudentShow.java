package org.example.main.StudentServices;

import org.example.main.StudentModel.Student;
import org.example.main.StudentInterface.StudentCrudService;

public class StudentShow implements StudentCrudService {
    @Override
    public void operate() {

        if(list.size()==0){
            System.out.println("NO DATA IS AVAILABLE");
        }
        else{
            System.out.println(list.size());
            for(Student s:list){
                System.out.println(s.toString());
            }
        }

    }


}
