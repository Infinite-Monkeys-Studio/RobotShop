package io.github.InfiniteMonkeysStudio.RobotShop;

import processing.core.PApplet;
import processing.core.PConstants;

/**
 * Represents a static immovable hard thing.
 * @author Quinn
 *
 */
public class Wall extends PassiveEntity{

	private static final long serialVersionUID = 1L;
	private String type; //DO there is only one type of wall
	private float extent;
	private boolean northSouth;
	
	/**
	 * Class constructor
	 * @param location where to place the wall
	 * @param type of wall to create
	 */
	public Wall(Location location, String type) {
		super(location);
		this.setType(type);
		northSouth = true;
		extent = 10;
	}
	
	/**
	 * Class constructor. Type will default to default.
	 * @param location where to place the wall
	 */
	public Wall(Location location) {
		super(location);
		this.setType("default");
		northSouth = true;
		extent = 10;
	}

	/**
	 * Cause the wall to draw on the canvas
	 * @param PApplet the canvas to draw on
	 */
	@Override
	public void draw(Viewport canvas) {
		canvas.pushMatrix();
		canvas.translate(location.getX(), location.getY());
		canvas.fill(0);
		canvas.textAlign(PConstants.CENTER);
		canvas.text("Wall", 0, -7);
		if(northSouth) {
			canvas.rect(-5, -5, 10, extent);
		} else {
			canvas.rect(-5, -5, extent, 10);
		}
		
		canvas.popMatrix();
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

	/**
	 * extent is the total length on the long side
	 * @return the extent
	 */
	public float getExtent() {
		return extent;
	}

	/**
	 * extent is the total length on the long side
	 * @param extent to set
	 */
	public void setExtent(float extent) {
		this.extent = extent;
	}

	/**
	 * @return if this wall is a north-south wall
	 */
	public boolean isNorthSouth() {
		return northSouth;
	}

	/**
	 * @param true means it will be a north-south wall
	 */
	public void setNorthSouth(boolean northSouth) {
		this.northSouth = northSouth;
	}
}
