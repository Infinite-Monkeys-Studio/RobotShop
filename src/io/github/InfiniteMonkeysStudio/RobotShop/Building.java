package io.github.InfiniteMonkeysStudio.RobotShop;
/**
 * This is a section of the shop.
 * @author Quinn
 *
 */
public class Building {
	
	private String name;
	private String type;//TODO write an enum
	/**
	 * Class constructor Type will be "default."
	 * @param name
	 */
	public Building(String name) {
		this.name = name;
		this.type = "Default";
	}
	
	/**
	 * Class constructor Setting the name and type of the building.
	 * @param name
	 * @param type
	 */
	public Building(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	/**
	 * Class constructor.
	 * Name defaults to NULL
	 * Type defaults to default
	 */
	public Building() {
		this.name = null;
		this.type = "Default";
	}
}
