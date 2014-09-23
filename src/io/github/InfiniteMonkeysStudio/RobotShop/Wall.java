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
	 * @param location
	 * @param type
	 */
	public Wall(Location location, String type) {
		super(location);
		this.setType(type);
	}
	
	/**
	 * Class constructor. Type will default to default.
	 * @param location
	 */
	public Wall(Location location) {
		super(location);
		this.setType("default");
	}

	@Override
	public void draw(PApplet canvas) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
