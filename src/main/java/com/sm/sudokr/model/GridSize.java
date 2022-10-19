package com.sm.sudokr.model;

enum GridSize {
	SMALL(6), 
	MEDIUM(9), 
	LARGE(16);
	
	final int size;
	
	private GridSize(int size) {
		this.size = size;
	}
}
