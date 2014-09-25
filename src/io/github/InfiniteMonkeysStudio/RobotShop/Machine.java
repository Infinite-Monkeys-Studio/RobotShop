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

	@Override
	public void draw(PApplet canvas) {
		canvas.pushMatrix();
		canvas.translate(location.getX(), location.getY());
		canvas.textAlign(PConstants.CENTER);
		canvas.fill(0);
		canvas.text("Machine", 0, -8);
		canvas.text(type, 0, 13);
		canvas.fill(150);
		canvas.rect(-5, -5, 10, 10);
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
