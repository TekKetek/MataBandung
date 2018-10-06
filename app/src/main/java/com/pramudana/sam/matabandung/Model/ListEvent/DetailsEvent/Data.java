package com.pramudana.sam.matabandung.Model.ListEvent.DetailsEvent;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("end_date")
	private String endDate;

	@SerializedName("start_time")
	private String startTime;

	@SerializedName("images")
	private List<String> images;

	@SerializedName("urls")
	private List<Object> urls;

	@SerializedName("end_time")
	private String endTime;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("type")
	private String type;

	@SerializedName("take_place")
	private String takePlace;

	@SerializedName("start_date")
	private String startDate;

	@SerializedName("tags")
	private List<TagsItem> tags;

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setImages(List<String> images){
		this.images = images;
	}

	public List<String> getImages(){
		return images;
	}

	public void setUrls(List<Object> urls){
		this.urls = urls;
	}

	public List<Object> getUrls(){
		return urls;
	}

	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	public String getEndTime(){
		return endTime;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTakePlace(String takePlace){
		this.takePlace = takePlace;
	}

	public String getTakePlace(){
		return takePlace;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	public List<TagsItem> getTags(){
		return tags;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"end_date = '" + endDate + '\'' + 
			",start_time = '" + startTime + '\'' + 
			",images = '" + images + '\'' + 
			",urls = '" + urls + '\'' + 
			",end_time = '" + endTime + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",type = '" + type + '\'' + 
			",take_place = '" + takePlace + '\'' + 
			",start_date = '" + startDate + '\'' + 
			",tags = '" + tags + '\'' + 
			"}";
		}
}