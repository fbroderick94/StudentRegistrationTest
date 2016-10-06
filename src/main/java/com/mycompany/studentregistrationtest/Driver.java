
package com.mycompany.studentregistrationtest;

import com.mycompany.studentregistration.*;
import java.util.ArrayList;
import org.joda.time.DateTime;



/**
 *
 * @author fergalbroderick
 */
public class Driver {
    
    
    public static void main(String[] args){
        
        
        //Creating Students and adding them to the list of students
        ArrayList<Student> Students = new ArrayList<Student>();
        Student Tom = new Student("Tom Delaney", "29/08/1994", 22);
        Student Mary = new Student("Mary Fahy", "30/01/1995", 21);
        Student Daniel = new Student("Daniel McCormack", "15/03/1985", 31);
        Student Sam = new Student("Sam Ryan", "30/04/1988", 28);
    
        Students.add(Tom);
        Students.add(Mary);
        Students.add(Daniel);
        Students.add(Sam);
        
        //Creating a range of different modules
        Module Programming = new Module("Programming","CT444");
        Module Network = new Module("Networking & Data Communications", "CT432");
        Module Algebra = new Module("Algebra", "MA443");
        Module Geography = new Module("Geography", "G345");
        
        
        //Adding students to specific modules
        Programming.addStudent(Tom);
        Programming.addStudent(Mary);
        Programming.addStudent(Daniel);
        Programming.addStudent(Sam);
        
        Network.addStudent(Tom);
        Network.addStudent(Mary);
        
        Algebra.addStudent(Daniel);
        
        Geography.addStudent(Sam);
        
        //Creating new course programmes (CS & IT and Arts)
        Programme IT = new Programme("Computer Science & Information Technology",new DateTime(2016, 9, 5, 9, 0), new DateTime(2017, 5, 19, 17, 0));
        Programme Arts = new Programme("Arts", new DateTime(2016, 9, 5, 12, 0), new DateTime(2017, 5, 8, 16, 0));
        
        
        //adding modules to the course programme list of modules
        IT.addModule(Network);
        IT.addModule(Programming);
        IT.addModule(Algebra);
        
        Arts.addModule(Programming);
        Arts.addModule(Geography);
        
        //Registering students for and course programme
        Tom.setProgramme(IT);
        Mary.setProgramme(IT);
        Daniel.setProgramme(IT);
        Sam.setProgramme(Arts);
        
        
        //Printing out every students name, age, ID, username, course and modules 
        System.out.println("List of the Students Registered");
        
        for (Student s : Students) {
            System.out.println(s.toString());
            System.out.println(s.getProgramme().toString());
            
            System.out.println("---List of Modules----");
            for(Module mod:s.getProgramme().getModules())
            {
               if(mod.getStudents().contains(s)){
                   System.out.println(mod.toString());
               }
            }
            System.out.println("\n");
        }
    }
   
}
