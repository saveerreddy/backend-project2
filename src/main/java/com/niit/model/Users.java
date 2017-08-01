package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity

public class Users 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private String firstname;
	
	private String lastname;
	
	private String email;
	
	private String username;
	
	private String password;
	
	/*private int age;*/
	
	private Float age;
		
	
	
	private String hobbies;
	
	private String intrest;

	private String role;
	@Column(name="on_line")
	private boolean online;

	private boolean enabled;
	public String getFirstname() 
	{
		return firstname;
	}
	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}
	public String getLastname() 
	{
		return lastname;
	}
	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
public Float getAge() {
		return age;
	}
	public void setAge(Float age) {
		this.age = age;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getIntrest() {
		return intrest;
	}
	public void setIntrest(String intrest) {
		this.intrest = intrest;
	}

	
	public String getRole() 
	{
		return role;
	}
	public void setRole(String role) 
	{
		this.role = role;
	}
	public boolean isOnline() 
	{
		return online;
	}
	public void setOnline(boolean online) 
	{
		this.online = online;
	}
	public boolean isEnabled() 
	{
		return enabled;
	}
	public void setEnabled(boolean enabled) 
	{
		this.enabled = enabled;
	}
}