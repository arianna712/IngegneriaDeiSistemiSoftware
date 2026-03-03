package main.java.conway.domain;

public class Grid implements IGrid{
	private Cell[][] grid;
	
	public Grid(int nrow, int ncol) {
		this.grid = new Cell[nrow][ncol];
	}
	
    // Imposta la griglia con una matrice di celle (copia profonda)
    @Override
    public void setGrid(Cell[][] matrix) {
        int nrow = matrix.length;
        int ncol = matrix[0].length;
        this.grid = new Cell[nrow][ncol];

        for (int i = 0; i < nrow; i++) {
            for (int j = 0; j < ncol; j++) {
                this.grid[i][j] = new Cell(matrix[i][j].isAlive());
            }
        }
    }

    // Leggi la cella in una posizione
    public Cell getCell(int row, int col) {
        return grid[row][col];
    }

    // Imposta lo stato di una cella (utile per Life)
    public void setCell(int row, int col, boolean alive) {
        if (grid[row][col] == null) {
            grid[row][col] = new Cell(alive);
        } else {
            grid[row][col].setStatus(alive);
        }
    }

    // Restituisce la griglia interna (utile per Life)
    public Cell[][] getGrid() {
        return grid;
    }

}
