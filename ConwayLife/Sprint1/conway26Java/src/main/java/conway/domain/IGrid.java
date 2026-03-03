package main.java.conway.domain;

public interface IGrid {
	public int getRowsNumber();
	public int getColumnsNumber();
	public void setCellValue(int x, int y, boolean state);
	public ICell getCell(int x, int y);
	public boolean getCellValue(int x, int y);
	public void reset();	
	
}
