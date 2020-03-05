package com.cts.project.user.pojo;


import javax.persistence.Entity;

import javax.persistence.Table;

import javax.persistence.Id;

import javax.persistence.Column;

 @Entity

 @Table(name="users")

 public class User {


 
  


@Override
	public String toString() {
		return "User [username=" + username + ", id=" + id + ", password=" + password + ", usertype=" + usertype
				+ ", confirm=" + confirm + ", email=" + email + ", mobile=" + mobile + "]";
	}



@Id
	  private String username;
  		private Integer id;

	  @Column(name="password",nullable=false,length=100)
	 
	     
     private String password;
       private String usertype;
       private String confirm;
   	private String email;
      private Integer mobile;
     
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getConfirmed() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	
    
	
	public String getConfirm() {
		return confirm;
	}

	


	

 
 }






