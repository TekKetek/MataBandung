package com.pramudana.sam.matabandung.Model.Tenant.Detail;

import com.google.gson.annotations.SerializedName;

public class SubSectorsItem{

	@SerializedName("sub_sector_slug")
	private String subSectorSlug;

	@SerializedName("sub_sector_description")
	private String subSectorDescription;

	@SerializedName("sub_sector_name")
	private String subSectorName;

	@SerializedName("id")
	private int id;

	@SerializedName("sub_sector_img")
	private String subSectorImg;

	public void setSubSectorSlug(String subSectorSlug){
		this.subSectorSlug = subSectorSlug;
	}

	public String getSubSectorSlug(){
		return subSectorSlug;
	}

	public void setSubSectorDescription(String subSectorDescription){
		this.subSectorDescription = subSectorDescription;
	}

	public String getSubSectorDescription(){
		return subSectorDescription;
	}

	public void setSubSectorName(String subSectorName){
		this.subSectorName = subSectorName;
	}

	public String getSubSectorName(){
		return subSectorName;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setSubSectorImg(String subSectorImg){
		this.subSectorImg = subSectorImg;
	}

	public String getSubSectorImg(){
		return subSectorImg;
	}

	@Override
 	public String toString(){
		return 
			"SubSectorsItem{" + 
			"sub_sector_slug = '" + subSectorSlug + '\'' + 
			",sub_sector_description = '" + subSectorDescription + '\'' + 
			",sub_sector_name = '" + subSectorName + '\'' + 
			",id = '" + id + '\'' + 
			",sub_sector_img = '" + subSectorImg + '\'' + 
			"}";
		}
}