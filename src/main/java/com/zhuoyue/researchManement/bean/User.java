package com.zhuoyue.researchManement.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zhuoyue.researchManement.enums.Gender;
import com.zhuoyue.researchManement.enums.RoleTypeEnum;

import java.util.Date;


/**
 * Created by 12413 on 2018/5/9.
 */
@JsonIgnoreProperties(value = {"handler"})
public class User {

	private Long id;
	private String uname;
	private String realname;
	@JsonIgnore
	private String password;
	private Gender gender;
	private String ethnic; // 民族
	private Unit unit;	// 单位
	@JsonFormat(pattern="yyyy年MM月dd日",timezone = "GMT+8")
	private Date birthday; // 出生日期
	private String email;
	private String position; // 职务
	private String professionalTitle; // 职称
	private String phone; // 电话
	private String telephone; // 固定电话
	private String fax; // 传真
	private String education; // 学历
	private String degree; // 学位
	private String profession; // 专业
	private String postcode; // 邮编
	private String address;
	private Date lastlogin;
	private RoleTypeEnum roleType;
	private Boolean active;
	private Boolean authc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEthnic() {
		return ethnic;
	}

	public void setEthnic(String ethnic) {
		this.ethnic = ethnic;
	}


	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getProfessionalTitle() {
		return professionalTitle;
	}

	public void setProfessionalTitle(String professionalTitle) {
		this.professionalTitle = professionalTitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getLastlogin() {
		return lastlogin;
	}

	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}

	public RoleTypeEnum getRoleType() {
		return roleType;
	}

	public void setRoleType(RoleTypeEnum roleType) {
		this.roleType = roleType;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getAuthc() {
		return authc;
	}

	public void setAuthc(Boolean authc) {
		this.authc = authc;
	}
}