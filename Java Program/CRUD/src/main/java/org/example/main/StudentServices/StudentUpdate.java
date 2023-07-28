package org.example.main.StudentServices;

import org.example.main.StudentModel.Student;
import org.example.main.StudentInterface.StudentCrudService;

import java.util.Scanner;

public class StudentUpdate implements StudentCrudService {
    Scanner in=new Scanner(System.in);
    @Override
    public void operate() {
        System.out.println("Enter The Id you want to update");
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
        else{
            System.out.println("Please Enter Student Id ");
            int idd=in.nextInt();
            System.out.println("Please Enter Student Name ");
            String name=in.next();
            System.out.println("Please Enter Student Last Name");
            String last=in.next();
            System.out.println("Please Enter Age of Student");
            int age=in.nextInt();

            st.setName(name);
            st.setAge(age);
            st.setLastname(last);
            st.setId(idd);
            System.out.println();
            System.out.println(st.toString());

        }

    }
}
