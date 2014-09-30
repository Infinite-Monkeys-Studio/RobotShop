package io.github.InfiniteMonkeysStudio.RobotShop;

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
		float screenX = canvas.getScreenX(location);
		float screenY = canvas.getScreenY(location);
		final int s = Viewport.getScale();
		
		canvas.pushMatrix();
		canvas.translate(screenX, screenY);
		
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

}
