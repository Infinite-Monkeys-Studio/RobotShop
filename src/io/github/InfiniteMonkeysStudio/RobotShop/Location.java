package io.github.InfiniteMonkeysStudio.RobotShop;

/**
 * Represents a location in the world.
 * @author Quinn
 *
 */
public class Location {
	
	private double x, y; //location in building
	private Building building; //Building of location
	
	/**
	 * Class constructor.
	 * @param x The X component of the location.
	 * @param y The Y component of the location.
	 * @param building The building the Location refers to.
	 */
	public Location(double x, double y, Building building){
		this.x = x;
		this.y = y;
		this.building = building;
	}
	
	/**
	 * Class construtor.
	 * @param x The X component of the location.
	 * @param y The Y component of the location.
	 */
	public Location(double x, double y){
		this.x = x;
		this.y = y;
		this.building = new Building();
	}
	
}
