package com.pramudana.sam.matabandung.Model.Tenant.Detail;

import com.google.gson.annotations.SerializedName;

public class TenantAddress{

	@SerializedName("subdistrict_id")
	private int subdistrictId;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("street")
	private String street;

	@SerializedName("latitude")
	private String latitude;

	@SerializedName("rtandrw")
	private Object rtandrw;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("postal_code")
	private String postalCode;

	@SerializedName("ekraf_tenant_id")
	private int ekrafTenantId;

	@SerializedName("longitude")
	private String longitude;

	public void setSubdistrictId(int subdistrictId){
		this.subdistrictId = subdistrictId;
	}

	public int getSubdistrictId(){
		return subdistrictId;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setStreet(String street){
		this.street = street;
	}

	public String getStreet(){
		return street;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setRtandrw(Object rtandrw){
		this.rtandrw = rtandrw;
	}

	public Object getRtandrw(){
		return rtandrw;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setEkrafTenantId(int ekrafTenantId){
		this.ekrafTenantId = ekrafTenantId;
	}

	public int getEkrafTenantId(){
		return ekrafTenantId;
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
			"TenantAddress{" + 
			"subdistrict_id = '" + subdistrictId + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",street = '" + street + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",rtandrw = '" + rtandrw + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",postal_code = '" + postalCode + '\'' + 
			",ekraf_tenant_id = '" + ekrafTenantId + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}