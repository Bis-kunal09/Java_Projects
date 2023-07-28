package org.example.main.StudentServices;
import org.example.main.StudentModel.Student;
import org.example.main.StudentInterface.StudentCrudService;

import java.util.Scanner;
public class StudentInsert implements StudentCrudService {
    Student st=new Student();
    Scanner in=new Scanner(System.in);
    public void operate(){
        System.out.println("Please Enter Student Id ");
        int id=in.nextInt();
        for(Student s:list){
            if(s.getId()==id){
                System.out.println("Id already Present");
                System.out.println();
                return;
            }
        }
        System.out.println("Please Enter Student Name ");
        String name=in.next();
        System.out.println("Please Enter Student Last Name");
        String last=in.next();
        System.out.println("Please Enter Age of Student");
        int age=in.nextInt();

        st.setName(name);
        st.setAge(age);
        st.setLastname(last);
        st.setId(id);
        list.add(st);




    }
}
