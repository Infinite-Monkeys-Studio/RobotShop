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
	//private String type; //DO there is only one type of wall
	private float extent;
	private boolean northSouth;
	private boolean isSelected = false;
	
	/**
	 * Class constructor. Type will default to default.
	 * @param location where to place the wall
	 */
	public Wall(Location location) {
		super(location);
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
	 * Extent is the total length on the long side
	 * @return the extent
	 */
	public float getExtent() {
		return extent;
	}

	/**
	 * Extent is the total length on the long side
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
		return isSelected;
	}

	@Override
	public void select() {
		isSelected = true;
	}

	@Override
	public void unselect() {
		isSelected = false;		
	}

	@Override
	public boolean toggleSelection() {
		isSelected = !isSelected;
		return isSelected;
	}
}
