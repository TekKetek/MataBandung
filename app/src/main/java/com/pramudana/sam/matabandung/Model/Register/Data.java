package com.pramudana.sam.matabandung.Model.Register;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("is_active")
	private boolean isActive;

	@SerializedName("app_email")
	private String appEmail;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("app_username")
	private String appUsername;

	@SerializedName("id")
	private int id;

	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public void setAppEmail(String appEmail){
		this.appEmail = appEmail;
	}

	public String getAppEmail(){
		return appEmail;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setAppUsername(String appUsername){
		this.appUsername = appUsername;
	}

	public String getAppUsername(){
		return appUsername;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"is_active = '" + isActive + '\'' + 
			",app_email = '" + appEmail + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",app_username = '" + appUsername + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}