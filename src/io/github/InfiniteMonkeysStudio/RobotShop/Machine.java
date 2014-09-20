package io.github.InfiniteMonkeysStudio.RobotShop;
/**
 * This is a mechanism that does stuff.
 * @author Quinn
 *
 */
public class Machine extends StaticEntity{

	private String type; //TODO Make MachineEnum
	
	/**
	 * Class constructor.
	 * @param location Location for the machine
	 * @param type Machine type
	 */
	public Machine(Location location , String type) {
		super(location);
		this.type = type;
	}

}
