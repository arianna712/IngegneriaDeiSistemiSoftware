package main.java.conway.domain;

public interface IGrid {
	public void setGrid (Cell[][] matrix);
	public Cell getCell(int row, int col);
	public void setCell(int row, int col, boolean alive);
	public Cell[][] getGrid();
	
	
}
