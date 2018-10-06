package com.pramudana.sam.matabandung.Model.Tenant.Data;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseDataTenant{

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("meta")
	private Meta meta;

	@SerializedName("count")
	private int count;

	@SerializedName("message")
	private String message;

	@SerializedName("errors")
	private int errors;

	@SerializedName("status")
	private String status;

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
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

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResponseDataTenant{" + 
			"data = '" + data + '\'' + 
			",meta = '" + meta + '\'' + 
			",count = '" + count + '\'' + 
			",message = '" + message + '\'' + 
			",errors = '" + errors + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}