package com.in28minutes.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@GeneratedValue
	@Id
	private int courseid;
	private String coursename;
	@OneToMany(mappedBy="course")
	private List<Review> reviewlist=new ArrayList<>();
	
	public Course() {super();}

	public Course(int courseid, String coursename) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		
	}

	public Course(String coursename) {
		super();
		this.coursename = coursename;
		
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public List<Review> getReviewlist() {
		return reviewlist;
	}

	public void setReviewlist(Review review) {
		this.reviewlist.add(review);
	}

	
	
}
