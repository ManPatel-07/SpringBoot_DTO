package org.mm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "marksheet")
public class Marksheet 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100)
	private String name;
	
	@Column(unique = true)
	private Integer rollno;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public Marksheet(Long id, String name, Integer rollno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
	}

	public Marksheet(String name, Integer rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	public Marksheet() {
		super();
	}
	
	
}
