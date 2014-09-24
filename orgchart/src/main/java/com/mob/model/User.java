package com.mob.model;

import java.io.Serializable;
import java.sql.Blob;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private long userId;
	private String emailId;
	private String fullName;
	private String contactNo;
	private String officeContactNo;
	private String jobDescription;
	private String hobbies;
	private boolean isActive;
	private boolean isResourceManager;
	private Blob userPicture;
	private Title titleId;
	private OfficeAddress officeLocationId;
	private User resourceManagerId;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getOfficeContactNo() {
		return officeContactNo;
	}

	public void setOfficeContactNo(String officeContactNo) {
		this.officeContactNo = officeContactNo;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isResourceManager() {
		return isResourceManager;
	}

	public void setResourceManager(boolean isResourceManager) {
		this.isResourceManager = isResourceManager;
	}

	public Blob getUserPicture() {
		return userPicture;
	}

	public void setUserPicture(Blob userPicture) {
		this.userPicture = userPicture;
	}

	public Title getTitleId() {
		return titleId;
	}

	public void setTitleId(Title titleId) {
		this.titleId = titleId;
	}

	public OfficeAddress getOfficeLocationId() {
		return officeLocationId;
	}

	public void setOfficeLocationId(OfficeAddress officeLocationId) {
		this.officeLocationId = officeLocationId;
	}

	public User getResourceManagerId() {
		return resourceManagerId;
	}

	public void setResourceManagerId(User resourceManagerId) {
		this.resourceManagerId = resourceManagerId;
	}

}
