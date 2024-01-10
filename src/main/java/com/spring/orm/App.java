package com.spring.orm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.studentDao;
import com.spring.orm.entities.student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
        ApplicationContext Context = new  ClassPathXmlApplicationContext("config.xml");
        studentDao studentDao = Context.getBean("studentDao", studentDao.class);
       
      
    	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	//int Id= Integer.parseInt(br.readLine());
    	student student = new student(113, "Faraz Dasurkar", "Thane");
        int r =  studentDao.Insert(student);
        
        System.out.println(r);
        studentDao.updatestudent(r, "Faraz Dasurkar","navi");
        student stud = studentDao.getstudent(r);
        
        System.out.println(stud.getStudentId());
        System.out.println(stud.getStudentName());
        System.out.println(stud.getStudentCity());
    
    }
}
