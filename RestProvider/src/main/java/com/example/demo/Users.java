package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="CrossOrigin")
public class Users {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name;
	@Column
	private Character gender;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(Integer id, String name, Character gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	

}
