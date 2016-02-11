package io.github.InfiniteMonkeysStudio.RobotShop.Entities;

import io.github.InfiniteMonkeysStudio.RobotShop.Location;
import io.github.InfiniteMonkeysStudio.RobotShop.Viewport;
import processing.core.PApplet;
import processing.core.PConstants;

/**
 * This is a mechanism that does stuff.
 * @author Quinn
 *
 */
public class Machine extends PassiveEntity{

	private static final long serialVersionUID = 1L;
	private String type; //DO Make MachineEnum
	private boolean isSelected = false;
	
	/**
	 * Class constructor.
	 * @param location Location for the machine
	 * @param type Machine type
	 */
	public Machine(Location location , String type) {
		super(location);
		this.setType(type);
	}

	/**
	 * Cause the Machine to draw on the canvas
	 * @param canvas the Viewport to draw on
	 */
	@Override
	public void draw(Viewport canvas) {
		float screenX = Location.getScreenX(location);
		float screenY = Location.getScreenY(location);
		final int s = Viewport.SCALE;
		
		canvas.pushMatrix();
		canvas.translate(screenX, screenY);
		
		if(this.isSelected()) {
			canvas.stroke(255, 0, 0);
		} else {
			canvas.stroke(0, 0, 0);
		}
		
		canvas.fill(150);
		canvas.rect(0, 0, s, s);
		
		canvas.textAlign(PConstants.CENTER);
		canvas.fill(0);
		canvas.text("Machine", s/2, 0);
		canvas.text(type, s/2, s/2);
		canvas.popMatrix();
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
