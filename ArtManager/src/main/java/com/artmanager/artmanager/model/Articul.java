package com.artmanager.artmanager.model;

import com.artmanager.artmanager.enums.ArtTechnic;
import com.artmanager.artmanager.enums.ArticulType;
import com.artmanager.artmanager.interfaces.HasId;

public class Articul implements HasId {
	private static final long serialVersionUID = 2388563009177088222L;
	
	private ArticulType type;
	private ArtTechnic technic;
	private String details;

	public ArticulType getType() {
		return type;
	}

	public void setType(ArticulType type) {
		this.type = type;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public int setId() {
		return id;
	}

	public ArtTechnic getTechnic() {
		return technic;
	}

	public void setTechnic(ArtTechnic technic) {
		this.technic = technic;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Articul [type=" + type + ", technic=" + technic + ", details=" + details + "]";
	}

}
