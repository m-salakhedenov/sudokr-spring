package com.sm.sudokr.model;

public enum GridSize {
	SMALL(6), 
	MEDIUM(9), 
	LARGE(16);
	
	final int size;
	
	private GridSize(int size) {
		this.size = size;
	}
}
