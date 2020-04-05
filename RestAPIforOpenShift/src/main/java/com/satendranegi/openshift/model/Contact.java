/**
 * 
 */
package com.satendranegi.openshift.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author SatendraNegi
 *
 */
@Entity
public class Contact {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String fullName;
	private String emailId;
	private String mobileNumber;
	private String message;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", fullName=" + fullName + ", emailId=" + emailId + ", mobileNumber="
				+ mobileNumber + ", message=" + message + ", createdDateTime=" + createdDateTime + "]";
	}
}
