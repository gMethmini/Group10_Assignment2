package com.csis3275.model_group10_assignment2;

public class TeamMember_group10_assignment2 {

	private String name;
	private String imageName;
	private String description;
	
	public TeamMember_group10_assignment2(String name, String imageName, String description) {
		this.name = name;
		this.imageName = imageName;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
