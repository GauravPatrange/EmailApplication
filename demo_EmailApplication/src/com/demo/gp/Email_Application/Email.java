package com.demo.gp.Email_Application;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String randomPassword;
	private String email;
	private String companySuffix = "companyname.com";
	private int mailBoxCapacity = 500;
	private String altEmail;
	private String password;
	
	Scanner scn = new Scanner(System.in);

	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: "+ this.firstName+" "+this.lastName);
		this.department =setDepartment();
//		System.out.println("Department code: "+ this.department);
		
		this.randomPassword = setRamdomPasswod(10);
//		System.out.println("E-mail Password: "+ this.randomPassword);
		
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+ companySuffix;
//		System.out.println("Your Email Address is: "+email);
		
		
	}
	


	public String setDepartment() {
		System.out.println("Enter the Department:\n1.for sales\n2.for Development \n3.Accounting \n4.for name ");
		int deptChoice = scn.nextInt();
		if(deptChoice == 1) { return "sale" ;}
		else if(deptChoice == 2) { return "dept" ;}
		else if(deptChoice == 3) {return "Acc";}
		else if(deptChoice == 4) {return "own";}
		return "";
	}
	
	private String setRamdomPasswod(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*abcdefghijklmnopqrstuvwxyz";
		char[] password =new char[length];
		for(int i=0; i<length;i++) {
			int rand = (int) (Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setMailCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	
	public void setNewPassword(String Password) {
		this.password = password;
	}
	
	public int getMailCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return altEmail;
	}
	
	public String getPassword() {
		return  password;
	}
	
	public String showInfo() {
		return "User Name:"+firstName + " " + lastName +"\n"+
				"User Email Address: "+ email+"\n"+
				"User Suggested Password: "+ randomPassword+"\n"+
				"User Mail box capacity: "+ mailBoxCapacity;
				
	}
	
	
}
