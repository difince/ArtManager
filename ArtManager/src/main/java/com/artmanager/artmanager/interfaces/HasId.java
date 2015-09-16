package com.artmanager.artmanager.interfaces;

import java.io.Serializable;

public interface HasId extends Serializable{
	public int id = 0;
	public abstract int getId();
	public abstract int setId();
		
	
}
