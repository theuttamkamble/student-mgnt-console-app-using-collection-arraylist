package com.student.pojo;

public class Student {
	private int sid;
	private String sname;
	private String email;
	private String course;
	private double fee;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, String email, String course, double fee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.course = course;
		this.fee = fee;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", course=" + course + ", fee=" + fee
				+ "]";
	}
}
