package com.poolsawat.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact implements Serializable{

	private static final long serialVersionUID = -1089506688920289812L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="mobile")
	private String mobile;

	@Column(name="email")
	private String email;
	
	@Column(name="modified_dtm")
	private Date modifiedDtm;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getModifiedDtm() {
		return modifiedDtm;
	}

	public void setModifiedDtm(Date modifiedDtm) {
		this.modifiedDtm = modifiedDtm;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", mobile=" + mobile + ", email=" + email + ", modifiedDtm=" + modifiedDtm + "]";
	}	
	
}
