package com.artmanager.artmanager.enums;

public enum ArtTechnic {
	OIL_PAINTING(1, "Oil Painting"),
	GRAPHIC(2, "Graphic"),
	WATER_PAINTING(3, "Water Painting");
	
	public int val;
	public String strVal;

	private ArtTechnic(int val, String strVal) {
		this.val = val;
		this.strVal = strVal;
	}
	
	public ArtTechnic valueOf(int val){
		switch (val) {
		case 1:
			return OIL_PAINTING;
		case 2:
			return GRAPHIC;
		case 3:
			return WATER_PAINTING;
		}
		throw new RuntimeException("ArtTechnic: value not supportted " + val);
	}
}
