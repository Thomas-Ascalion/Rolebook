package com.rolebook.model;

public class User {
	private int id;
	private String name;
	private String email;
	private String password;
	private String userName;
	private String mobileNumber;
	private String securityQuestion;
	private String answer;
	private String autorisation;
	
	private String firstname;
	private String address;
	private String cp;
	private String city;
	private String country;
	private String profileImg;
	
	
	
	public User() {
		super();
	}


	public User(int id, String name, String email, String password, String userName, String mobileNumber,
			String securityQuestion, String answer, String autorisation) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.userName = userName;
		this.mobileNumber = mobileNumber;
		this.securityQuestion = securityQuestion;
		this.answer = answer;
		this.autorisation = autorisation;
	}

	public User(int id, String name, String email, String password, String userName, String mobileNumber,
			String securityQuestion, String answer, String autorisation, String firstname, String address, String cp,
			String city, String country, String profileImg) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.userName = userName;
		this.mobileNumber = mobileNumber;
		this.securityQuestion = securityQuestion;
		this.answer = answer;
		this.autorisation = autorisation;
		this.firstname = firstname;
		this.address = address;
		this.cp = cp;
		this.city = city;
		this.country = country;
		this.profileImg = profileImg;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getSecurityQuestion() {
		return securityQuestion;
	}


	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public String getAutorisation() {
		return autorisation;
	}


	public void setAutorisation(String autorisation) {
		this.autorisation = autorisation;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getAdress() {
		return address;
	}


	public void setAdress(String address) {
		this.address = address;
	}


	public String getCp() {
		return cp;
	}


	public void setCp(String cp) {
		this.cp = cp;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getProfileImg() {
		return profileImg;
	}


	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	
	
}
	
	
	
