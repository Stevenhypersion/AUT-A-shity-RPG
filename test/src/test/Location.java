package test;
/**
 * @author luozeting
 * @version 0.0.1
 */

public class Location {
	private int xAxis;
	private int yAxis;
	
	private boolean hasPlayer;
	private boolean hasWall;
	private boolean hasMonster;
	
	Location()
	{
		this.setxAxis(-1);
		this.setyAxis(-1);
		this.setHasPlayer(false);
		this.setHasWall(false);
		this.setHasMonster(false);
	}
	
	
	
	Location(int xAxis,int yAxis)
	{
		this.setxAxis(xAxis);
		this.setyAxis(yAxis);
		this.setHasPlayer(false);
	}

	public int getxAxis() {
		return xAxis;
	}

	public void setxAxis(int xAxis) {
		this.xAxis=xAxis;
		
	}

	public int getyAxis() {
		return yAxis;
	}

	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}
	public boolean isHasPlayer() {
		return hasPlayer;
	}



	public void setHasPlayer(boolean hasPlayer) {
		this.hasPlayer = hasPlayer;
	}
	

	public boolean isHasWall() {
		return hasWall;
	}



	public void setHasWall(boolean hasWall) {
		this.hasWall = hasWall;
	}
	
	



	public boolean isHasMonster() {
		return hasMonster;
	}



	public void setHasMonster(boolean hasMonster) {
		this.hasMonster = hasMonster;
	}



	public String toString()
	{
			
		if(this.hasPlayer)
		{
			return "~▲~";
		}
		else if(this.hasWall)
		{
			return "▄▄▄";
		}
		else if(this.hasMonster)
		{	
			return "~Φ~";
		}
		else
		{
			return "~~~";
		}
	
		
	}
	
}
