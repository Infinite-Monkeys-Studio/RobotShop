package io.github.InfiniteMonkeysStudio.RobotShop;

import processing.core.PApplet;

/**
 * Represents a static immovable hard thing.
 * @author Quinn
 *
 */
public class Wall extends StaticEntity{

	private static final long serialVersionUID = 1L;
	private String type; //TODO make Wall enum
	
	/**
	 * Class constructor
	 * @param location where to place the wall
	 * @param type of wall to create
	 */
	public Wall(Location location, String type) {
		super(location);
		this.setType(type);
	}
	
	/**
	 * Class constructor. Type will default to default.
	 * @param location where to place the wall
	 */
	public Wall(Location location) {
		super(location);
		this.setType("default");
	}

	@Override
	public void draw(PApplet canvas) {
				
	}

	/**
	 * @return type of the wall
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type to set the wall to
	 */
	public void setType(String type) {
		this.type = type;
	}
}
