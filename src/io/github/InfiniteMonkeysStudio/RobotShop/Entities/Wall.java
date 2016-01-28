package io.github.InfiniteMonkeysStudio.RobotShop.Entities;

import io.github.InfiniteMonkeysStudio.RobotShop.Location;
import io.github.InfiniteMonkeysStudio.RobotShop.Viewport;
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
		extent = 3;
	}
	
	/**
	 * Class constructor. Type will default to default.
	 * @param location where to place the wall
	 */
	public Wall(Location location) {
		super(location);
		this.setType("default");
		northSouth = true;
		extent = 3;
	}

	/**
	 * Cause the wall to draw on the canvas
	 * @param canvas the Viewport to draw on
	 */
	@Override
	public void draw(Viewport canvas) {
		float screenX = Location.getScreenX(location);
		float screenY = Location.getScreenY(location);
		final int s = Viewport.SCALE;
		
		canvas.pushMatrix();
		canvas.translate(screenX, screenY);
		canvas.fill(0);
		if(northSouth) {
			canvas.rect(0, 0, s, extent * s);
		} else {
			canvas.rect(0, 0, extent * s, s);
		}
		canvas.fill(255);
		canvas.textAlign(PConstants.CENTER);
		canvas.text("Wall", (extent * s) / 2, s/2);
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
	 * @param northSouth true means it will be a north-south wall
	 */
	public void setNorthSouth(boolean northSouth) {
		this.northSouth = northSouth;
	}

	@Override
	public boolean isSelected() {
		// FIXME Auto-generated method stub
		return false;
	}

	@Override
	public void select() {
		// FIXME Auto-generated method stub
		
	}

	@Override
	public void unselect() {
		// FIXME Auto-generated method stub
		
	}
}
