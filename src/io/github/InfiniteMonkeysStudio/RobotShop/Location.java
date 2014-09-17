package io.github.InfiniteMonkeysStudio.RobotShop;

public class Location {
	
	private double x, y; //location in building
	private Building building; //Building of location
	
	Location(double x, double y, Building building){
		this.x = x;
		this.y = y;
		this.building = building;
	}
	
}
