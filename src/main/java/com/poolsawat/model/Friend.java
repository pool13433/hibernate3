package com.poolsawat.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Friend")
public class Friend implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3775255456074110849L;

	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="modified_dtm")
	private Integer modifiedDtm;
	
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

	public Integer getModifiedDtm() {
		return modifiedDtm;
	}

	public void setModifiedDtm(Integer modifiedDtm) {
		this.modifiedDtm = modifiedDtm;
	}

	@Override
	public String toString() {
		return "Friend [id=" + id + ", name=" + name + ", age=" + age + ", modifiedDtm=" + modifiedDtm + "]";
	}

	
}
