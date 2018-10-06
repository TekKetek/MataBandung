package com.pramudana.sam.matabandung.Model.Tenant.Detail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("portofolios")
	private List<Object> portofolios;

	@SerializedName("tenant_logo")
	private String tenantLogo;

	@SerializedName("tenant_name")
	private String tenantName;

	@SerializedName("albums")
	private List<Object> albums;

	@SerializedName("clients")
	private List<Object> clients;

	@SerializedName("latitude")
	private String latitude;

	@SerializedName("tenant_profile")
	private Object tenantProfile;

	@SerializedName("tenant_email")
	private String tenantEmail;

	@SerializedName("sub_sectors")
	private List<SubSectorsItem> subSectors;

	@SerializedName("tenant_phone")
	private String tenantPhone;

	@SerializedName("tenant_address")
	private TenantAddress tenantAddress;

	@SerializedName("id")
	private int id;

	@SerializedName("tenant_services")
	private List<Object> tenantServices;

	@SerializedName("social_sites")
	private List<Object> socialSites;

	@SerializedName("tenant_color_background")
	private Object tenantColorBackground;

	@SerializedName("status")
	private Object status;

	@SerializedName("longitude")
	private String longitude;

	public void setPortofolios(List<Object> portofolios){
		this.portofolios = portofolios;
	}

	public List<Object> getPortofolios(){
		return portofolios;
	}

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

	public void setAlbums(List<Object> albums){
		this.albums = albums;
	}

	public List<Object> getAlbums(){
		return albums;
	}

	public void setClients(List<Object> clients){
		this.clients = clients;
	}

	public List<Object> getClients(){
		return clients;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setTenantProfile(Object tenantProfile){
		this.tenantProfile = tenantProfile;
	}

	public Object getTenantProfile(){
		return tenantProfile;
	}

	public void setTenantEmail(String tenantEmail){
		this.tenantEmail = tenantEmail;
	}

	public String getTenantEmail(){
		return tenantEmail;
	}

	public void setSubSectors(List<SubSectorsItem> subSectors){
		this.subSectors = subSectors;
	}

	public List<SubSectorsItem> getSubSectors(){
		return subSectors;
	}

	public void setTenantPhone(String tenantPhone){
		this.tenantPhone = tenantPhone;
	}

	public String getTenantPhone(){
		return tenantPhone;
	}

	public void setTenantAddress(TenantAddress tenantAddress){
		this.tenantAddress = tenantAddress;
	}

	public TenantAddress getTenantAddress(){
		return tenantAddress;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTenantServices(List<Object> tenantServices){
		this.tenantServices = tenantServices;
	}

	public List<Object> getTenantServices(){
		return tenantServices;
	}

	public void setSocialSites(List<Object> socialSites){
		this.socialSites = socialSites;
	}

	public List<Object> getSocialSites(){
		return socialSites;
	}

	public void setTenantColorBackground(Object tenantColorBackground){
		this.tenantColorBackground = tenantColorBackground;
	}

	public Object getTenantColorBackground(){
		return tenantColorBackground;
	}

	public void setStatus(Object status){
		this.status = status;
	}

	public Object getStatus(){
		return status;
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
			"Data{" + 
			"portofolios = '" + portofolios + '\'' + 
			",tenant_logo = '" + tenantLogo + '\'' + 
			",tenant_name = '" + tenantName + '\'' + 
			",albums = '" + albums + '\'' + 
			",clients = '" + clients + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",tenant_profile = '" + tenantProfile + '\'' + 
			",tenant_email = '" + tenantEmail + '\'' + 
			",sub_sectors = '" + subSectors + '\'' + 
			",tenant_phone = '" + tenantPhone + '\'' + 
			",tenant_address = '" + tenantAddress + '\'' + 
			",id = '" + id + '\'' + 
			",tenant_services = '" + tenantServices + '\'' + 
			",social_sites = '" + socialSites + '\'' + 
			",tenant_color_background = '" + tenantColorBackground + '\'' + 
			",status = '" + status + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}