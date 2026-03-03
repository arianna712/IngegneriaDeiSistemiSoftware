package main.java.conway.domain;

public class Grid implements IGrid{
	private ICell[][] grid;
	
	public Grid(int rows, int cols) {
		if(rows <= 0 || cols <= 0) throw new IllegalArgumentException();
		this.grid = new Cell[rows][cols];
	}

	@Override
	public int getRowsNumber() {
		// TODO Auto-generated method stub
		return grid.length;
	}

	@Override
	public int getColumnsNumber() {
		// TODO Auto-generated method stub
		return grid[0].length;
	}

	@Override
	public void setCellValue(int x, int y, boolean state) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ICell getCell(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getCellValue(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

}
