package com.in28minutes.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@GeneratedValue
	@Id
	private int reviewid;
	private String reviewdetail;
	@ManyToOne
	private Course course;
	public Review(int reviewid, String reviewdetail) {
		super();
		this.reviewid = reviewid;
		this.reviewdetail = reviewdetail;
		
	}
	public Review(String reviewdetail) {
		super();
		this.reviewdetail = reviewdetail;
	
	}
	public Review() {
		super();
	}
	public int getReviewid() {
		return reviewid;
	}
	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}
	public String getReviewdetail() {
		return reviewdetail;
	}
	public void setReviewdetail(String reviewdetail) {
		this.reviewdetail = reviewdetail;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course c) {
		this.course=c  ;
	}

}
