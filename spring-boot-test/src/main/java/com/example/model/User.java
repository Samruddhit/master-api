package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
@NamedQueries (
		@NamedQuery(name="User.findByEmail", query="SELECT u FROM User u WHERE u.email = :pEmail")
)
public class User {
	@Id
	@GeneratedValue(generator="uuid2")
	@GenericGenerator(name="uuid2", strategy="uuid2")
private int Id;
private String First_Name;
private String Last_Name;
@Column(unique= true)
private String email;
@Column(unique= true)
private String UserName;
private String password;
private long contact;

public User(int id, String first_Name, String last_Name, String email, String userName, String password,
		long contact) {

	Id = id;
	First_Name = first_Name;
	Last_Name = last_Name;
	this.email = email;
	UserName = userName;
	this.password = password;
	this.contact = contact;
}


public int getId() {
	return Id;
}
public User(int id, String first_Name) {

	Id = id;
	First_Name = first_Name;
}
public void setId(int id) {
	Id = id;
}
public String getFirst_Name() {
	return First_Name;
}
public void setFirst_Name(String first_Name) {
	First_Name = first_Name;
}
public String getLast_Name() {
	return Last_Name;
}
public void setLast_Name(String last_Name) {
	Last_Name = last_Name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}


}
