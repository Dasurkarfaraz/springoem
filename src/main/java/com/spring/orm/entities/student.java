package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student_detials")
public class student {

		@Id
		@GeneratedValue
		@Column(name = "studentId")
		private int studentId;
		
		@Column(name = "studentName")
		private String studentName;
		
		@Column(name = "studentCity")
		private String studentCity;
			
		public student(int studentId, String studentName, String studentCity) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentCity = studentCity;
		}
		
		public student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getStudentCity() {
			return studentCity;
		}
		public void setStudentCity(String studentCity) {
			this.studentCity = studentCity;
		}
}
