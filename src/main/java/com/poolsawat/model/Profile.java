package com.poolsawat.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Profile")
public class Profile implements Serializable{

	private static final long serialVersionUID = -1819306072076656542L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="modified_dtm",nullable=true)
	private Date modifiedDtm;
	
	@Column(name="friend_id",nullable=true)
	private Integer friendId;
	
	@Column(name="contact_id",nullable=true)
	private Integer contactId;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="id",referencedColumnName="friend_id")
	private List<Friend> friends;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id",referencedColumnName="contact_id")
	private Contact contact;

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Date getModifiedDtm() {
		return modifiedDtm;
	}


	public void setModifiedDtm(Date modifiedDtm) {
		this.modifiedDtm = modifiedDtm;
	}


	public List<Friend> getFriends() {
		return friends;
	}


	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}


	public Contact getContact() {
		return contact;
	}


	public void setContact(Contact contact) {
		this.contact = contact;
	}

	

	public Integer getFriendId() {
		return friendId;
	}


	public void setFriendId(Integer friendId) {
		this.friendId = friendId;
	}


	public Integer getContactId() {
		return contactId;
	}


	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}


	@Override
	public String toString() {
		return "Profile [id=" + id + ", name=" + name + ", age=" + age + ", modifiedDtm=" + modifiedDtm + ", friendId="
				+ friendId + ", contactId=" + contactId + ", friends=" + friends + ", contact=" + contact + "]";
	}



	
	
	
}
