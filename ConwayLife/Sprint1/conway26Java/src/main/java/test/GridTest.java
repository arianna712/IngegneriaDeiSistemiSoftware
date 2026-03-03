package main.java.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.conway.domain.Cell;
import main.java.conway.domain.Grid;
import main.java.conway.domain.ICell;
import main.java.conway.domain.IGrid;

public class GridTest {
private IGrid g;
	
	@Before
	public void setup() {
		System.out.println("ConwayLifeTest | setup");	
	 	g = new Grid(3, 4);
	}

	@After
	public void down() {
		System.out.println("ConwayLifeTest | down");
	}
	
	@Test 
	public void testDims() {
		System.out.println("testDims-----------");
		int nr = g.getRowsNumber();
		int nc = g.getColumnsNumber();
		assertTrue( nr == 3 && nc == 4);
	}
	
	@Test 
	public void testCGridCellValue() {
		System.out.println("testCGridCellValue------------");
		g.setCellValue(0, 0, true);
		assertTrue(g.getCellValue(0,0));
		assertTrue(g.getCellValue(0,1));
		
	}
	
	@Test 
	public void testGridRep() {
		System.out.println("testGridRep------------");
		System.out.println(""+g);
		assertTrue(g.toString().startsWith(". . . . ."));
		
	}
	
}
