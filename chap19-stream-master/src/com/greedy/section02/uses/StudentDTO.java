package com.greedy.section02.uses;

public class StudentDTO {
	
	private int no;
	private int classNo;
	private String name;
	private int score;
	
	public StudentDTO() {}

	public StudentDTO(int no, int classNo, String name, int score) {
		super();
		this.no = no;
		this.classNo = classNo;
		this.name = name;
		this.score = score;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getClassNo() {
		return classNo;
	}

	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "StudentDTO [no=" + no + ", classNo=" + classNo + ", name=" + name + ", score=" + score + "]";
	}
	
	

}
