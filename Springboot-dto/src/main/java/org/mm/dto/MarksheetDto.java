package org.mm.dto;

import java.io.Serializable;

public class MarksheetDto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Integer rollno;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public MarksheetDto(Long id, Integer rollno, String name) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.name = name;
	}
	public MarksheetDto(Integer rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public MarksheetDto() {
		super();
	}
	
}
