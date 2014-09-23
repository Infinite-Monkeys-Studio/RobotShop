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
	 * @param type of supply
	 */
	public Supply(String type){
		this.setType(type);
	}
	
	/**
	 * Class constructor. type will be default.
	 */
	public Supply() {
		this.setType("default");
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
