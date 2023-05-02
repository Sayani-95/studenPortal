package com.sp.assign2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String course;
	private double grade;
	
	public Student() {
    }
	public Student(int id, String name, int age, String course, double grade) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.age=age;
		this.course=course;
		this.grade=grade;
	}
	 public Student( String name, int age, String course, double grade) {
		 this.name=name;
			this.age=age;
			this.course=course;
			this.grade=grade;
	    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
}
