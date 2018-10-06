package com.pramudana.sam.matabandung.Model.Tenant.Detail;

import com.google.gson.annotations.SerializedName;

public class ResponseDetail{

	@SerializedName("data")
	private Data data;

	@SerializedName("message")
	private String message;

	@SerializedName("errors")
	private int errors;

	@SerializedName("status")
	private int status;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setErrors(int errors){
		this.errors = errors;
	}

	public int getErrors(){
		return errors;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResponseDetail{" + 
			"data = '" + data + '\'' + 
			",message = '" + message + '\'' + 
			",errors = '" + errors + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}