package ua.training.form.model;

import java.util.Date;

/**
 * Created by oleglitvinenko on Jul 17, 2019
 */
public class Note {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private Group group;
	private String nickname;
	private String comment;
	private String homePhone;
	private String mobilePhone;
	private String mobilePhoneExtra;
	private String email;
	private String skype;
	private String city;
	private String street;
	private String house;
	private String apartment;
	private String zipCode;
	private Date created;
	private Date lastUpdate;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getMobilePhoneExtra() {
		return mobilePhoneExtra;
	}

	public void setMobilePhoneExtra(String mobilePhoneExtra) {
		this.mobilePhoneExtra = mobilePhoneExtra;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSkype() {
		return skype;
	}
	
	public void setSkype(String skype) {
		this.skype = skype;
	}
	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public enum Group {
		
		SUBSCRIBER, PRIVATE_ORGANIZATION, GOVERNOR_DEPARTMENT
		
	}
	
}
