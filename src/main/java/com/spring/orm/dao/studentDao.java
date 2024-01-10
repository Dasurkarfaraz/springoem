package com.spring.orm.dao;

import javax.persistence.GeneratedValue;
import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.student;

public class studentDao {
	
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int Insert(student student) {
		//insert
		Integer i =(Integer) this.hibernateTemplate.save(student);
		return i;
	}

	public student getstudent(int  studentid) {
		//insert
		
		student student = this.hibernateTemplate.get(student.class, studentid);
		return student;
	}
	
	@GeneratedValue
	@Transactional
	public void updatestudent(int studentid, String studentCity, String studentName) {
		//insert
		student student = this.hibernateTemplate.get(student.class, studentid);

	    if (student != null) {
	    	student.setStudentId(studentid);
	    	student.setStudentCity(studentCity);;
	    	student.setStudentName(studentName);
	    }
	
	    this.hibernateTemplate.update(student);
			
		
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	
}
