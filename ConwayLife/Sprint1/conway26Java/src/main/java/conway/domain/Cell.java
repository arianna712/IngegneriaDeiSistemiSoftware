package main.java.conway.domain;

public class Cell implements ICell{
	
	//Definisco la rappresentazione concreta di una cella
	private boolean status;
	

	@Override
	public void setStatus(boolean aliveness) {
		// TODO Auto-generated method stub
		this.status=aliveness;
		
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return status;
	}
	

}
