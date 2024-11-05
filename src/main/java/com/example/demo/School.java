package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class School {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private Long id;
     private String firstName;
     private String lastName;
     private String email;
     private String mobNo;
     private String gender;
     private String dob;
     private String religion;
     private String language;
     private String address;
     private String landmark;
     private String city;
     private String region;
     private String pincode;
     private String country;
     private String ffirstName;
     private String flastName;
     private String mfirstName;
     private String mlastName;
     private String male;
     private String female;
     private String file;
     
    
     
	
	
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getMale() {
		return male;
	}
	public void setMale(String male) {
		this.male = male;
	}
	public String getFemale() {
		return female;
	}
	public void setFemale(String female) {
		this.female = female;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFfirstName() {
		return ffirstName;
	}
	public void setFfirstName(String ffirstName) {
		this.ffirstName = ffirstName;
	}
	public String getFlastName() {
		return flastName;
	}
	public void setFlastName(String flastName) {
		this.flastName = flastName;
	}
	public String getMfirstName() {
		return mfirstName;
	}
	public void setMfirstName(String mfirstName) {
		this.mfirstName = mfirstName;
	}
	public String getMlastName() {
		return mlastName;
	}
	public void setMlastName(String mlastName) {
		this.mlastName = mlastName;
	}
	
	
     

	
}
