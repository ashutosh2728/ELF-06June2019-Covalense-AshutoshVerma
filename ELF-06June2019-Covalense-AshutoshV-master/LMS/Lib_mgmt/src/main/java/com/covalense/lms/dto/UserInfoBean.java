package com.covalense.lms.dto;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
@SuppressWarnings("serial")
@JsonRootName(value = "USER_DETAILS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userId")
@Table(name = "USER_DETAILS")
@Entity
@Data
public class UserInfoBean {

	@Id
	@Column(name = "USER_ID")
	private Integer userId;
	@Column(name = "USER_TYPE")
	private String userType;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "ADDRESS1")
	private String address1;
	@Column(name = "ADDRESS2")
	private String address2;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "PINCODE")
	private Integer pincode;
	@Column(name = "PHONE_NUMBER")
	private long phoneNum;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PASSWORD")
	private String password;

}
