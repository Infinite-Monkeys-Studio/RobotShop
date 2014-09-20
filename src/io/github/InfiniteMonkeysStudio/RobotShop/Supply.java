package io.github.InfiniteMonkeysStudio.RobotShop;

/**
 * A single supply.
 * TODO make an enum
 * @author Quinn
 *
 */
public class Supply {
	
	private String type; //TODO make enum
	
	/**
	 * Class constructor Specifying the type of the supply
	 * @param type
	 */
	public Supply(String type){
		this.type = type;
	}
	
	/**
	 * Class constructor. type will be default.
	 */
	public Supply() {
		this.type = "default";
	}
}
