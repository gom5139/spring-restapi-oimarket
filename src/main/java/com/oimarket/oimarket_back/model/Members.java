package com.oimarket.oimarket_back.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="Members")
public class Members {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String pw;
	private String mName;
	private String email;
	private String phone;
	private String address;
	private Date created_at;
	private int adminCk;
	
	public Members(long id, String pw, String mName, String email, String phone, String address, Date created_at,
			int adminCk) {
		super();
		this.id = id;
		this.pw = pw;
		this.mName = mName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.created_at = created_at;
		this.adminCk = adminCk;
	}
	
	

}
