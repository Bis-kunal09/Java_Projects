package org.example.main.StudentServices;

import org.example.main.StudentModel.Student;
import org.example.main.StudentInterface.StudentCrudService;

import java.util.Scanner;

public class StudentDelete  implements StudentCrudService {
    Scanner in=new Scanner(System.in);
    @Override
    public void operate() {
        System.out.println("Please Enter The Id you want to Delete");
        int id=in.nextInt();
        Student todel=null;
        for(Student s:list){
            if(s.getId()==id){
                todel=s;
                System.out.println(s.toString());


            }
        }
        if(todel==null){
            System.out.println("No Such Record Found");
        }
        else{
            list.remove(todel);
            System.out.println(" Successfully Deleted");
        }
    }
}
