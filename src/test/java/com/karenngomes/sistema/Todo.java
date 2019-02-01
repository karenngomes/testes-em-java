package com.karenngomes.sistema;

public class Todo {
	private final long id;
	private String sumary;
	private String description;
	private int year;
	
	public Todo(int id, String sumary, String description) {
		this.id = id;
		this.sumary = sumary;
		this.description = description;
	}

	public String getSumary() {
		return sumary;
	}

	public void setSumary(String sumary) {
		this.sumary = sumary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getId() {
		return id;
	}
	
}
