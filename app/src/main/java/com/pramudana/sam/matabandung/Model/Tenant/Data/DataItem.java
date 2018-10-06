package com.pramudana.sam.matabandung.Model.Tenant.Data;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("tenant_logo")
	private String tenantLogo;

	@SerializedName("tenant_name")
	private String tenantName;

	@SerializedName("sub_sector_name")
	private String subSectorName;

	@SerializedName("latitude")
	private String latitude;

	@SerializedName("id")
	private int id;

	@SerializedName("longitude")
	private String longitude;

	public void setTenantLogo(String tenantLogo){
		this.tenantLogo = tenantLogo;
	}

	public String getTenantLogo(){
		return tenantLogo;
	}

	public void setTenantName(String tenantName){
		this.tenantName = tenantName;
	}

	public String getTenantName(){
		return tenantName;
	}

	public void setSubSectorName(String subSectorName){
		this.subSectorName = subSectorName;
	}

	public String getSubSectorName(){
		return subSectorName;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"tenant_logo = '" + tenantLogo + '\'' + 
			",tenant_name = '" + tenantName + '\'' + 
			",sub_sector_name = '" + subSectorName + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",id = '" + id + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}