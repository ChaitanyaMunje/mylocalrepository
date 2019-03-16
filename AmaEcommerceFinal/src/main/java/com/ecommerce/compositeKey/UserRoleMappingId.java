package com.ecommerce.compositeKey;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class UserRoleMappingId implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int role_id;
	private int user_id;
	
	public UserRoleMappingId() {
		
	}
	
	public UserRoleMappingId(int role_id,int user_id){
		this.role_id=role_id;
		this.user_id=user_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
}
