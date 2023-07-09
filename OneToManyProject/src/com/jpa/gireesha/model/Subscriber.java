package com.jpa.gireesha.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Subscriber")
public class Subscriber 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer subscriberId;

@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="subscriber")
List<Member> member;

public List<Member> getMember() {
	return member;
}

public void setMember(List<Member> member) {
	this.member = member;
}

@Column(length=10)
private String subName;

@Column(length=10)
private String city;

@Column(length=10)
private String startDate;

@Column(length=10)
private String endDate;

@Column(length=10)
private Integer houseNo;

@Column(length=10)
private Integer pincode;

@Column(length=10)
private Integer premium;

@Column(length=10)
private Integer claim;

public Integer getSubscriberId() {
	return subscriberId;
}

public void setSubscriberId(Integer subscriberId) {
	this.subscriberId = subscriberId;
}

public String getSubName() {
	return subName;
}

public void setSubName(String subName) {
	this.subName = subName;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getStartDate() {
	return startDate;
}

public void setStartDate(String startDate) {
	this.startDate = startDate;
}

public String getEndDate() {
	return endDate;
}

public void setEndDate(String endDate) {
	this.endDate = endDate;
}

public Integer getHouseNo() {
	return houseNo;
}

public void setHouseNo(Integer houseNo) {
	this.houseNo = houseNo;
}

public Integer getPincode() {
	return pincode;
}

public void setPincode(Integer pincode) {
	this.pincode = pincode;
}

public Integer getPremium() {
	return premium;
}

public void setPremium(Integer premium) {
	this.premium = premium;
}

public Integer getClaim() {
	return claim;
}

public void setClaim(Integer claim) {
	this.claim = claim;
}

}
