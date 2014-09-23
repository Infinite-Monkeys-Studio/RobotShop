package io.github.InfiniteMonkeysStudio.RobotShop;

import processing.core.PApplet;

/**
 * This is a mechanism that does stuff.
 * @author Quinn
 *
 */
public class Machine extends StaticEntity{

	private static final long serialVersionUID = 1L;
	private String type; //TODO Make MachineEnum
	
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
