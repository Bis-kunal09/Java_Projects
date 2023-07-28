package org.example.main.StudentServices;

import org.example.main.StudentModel.Student;
import org.example.main.StudentInterface.StudentCrudService;

import java.util.Scanner;

public class StudentSearch implements StudentCrudService {
    Scanner in=new Scanner(System.in);
    @Override
    public void operate() {
        System.out.println("Enter The Id you want to Search");
        int id=in.nextInt();
        Student st=null;
        for(Student s:list){
            if(id==s.getId()){
                st=s;
            }
        }
        if(st==null){
            System.out.println("No Such Id present");
        }
        else {
            System.out.println("Id Present");
            System.out.println();
            System.out.println(st.toString());
        }

    }
}
