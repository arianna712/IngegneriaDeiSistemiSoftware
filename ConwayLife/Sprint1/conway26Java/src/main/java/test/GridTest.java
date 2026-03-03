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
	 	g = new Grid();
	}

	@After
	public void down() {
		System.out.println("ConwayLifeTest | down");
	}
	
	@Test 
	public void testCellAlive() {
		System.out.println("ConwayLifeTest | doing alive");
		
	}
	
	@Test 
	public void testCellDead() {
		System.out.println("ConwayLifeTest | doing dead");
		
	}
}
