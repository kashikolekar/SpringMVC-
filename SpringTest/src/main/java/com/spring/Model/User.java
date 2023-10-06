package com.spring.Model;




//@Entity
public class User {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//private int id;
	
	
	private String email;
	private String name;
	private String pass;
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", pass=" + pass + "]";
	}
	

}
