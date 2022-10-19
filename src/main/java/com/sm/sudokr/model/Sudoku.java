package com.sm.sudokr.model;

public class Sudoku {
	
	protected final int size;
	protected final int[][] sudoku;
	
	public Sudoku(GridSize gridSize) {
		this.size = gridSize.size;
		this.sudoku = new int[size][size];
	}
	
	public void set(int row, int column, int value) {
		sudoku[row][column] = value;
	}
	
	public int get(int row, int column) {
		return sudoku[row][column];
	}

}
