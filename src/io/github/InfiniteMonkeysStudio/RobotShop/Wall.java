package io.github.InfiniteMonkeysStudio.RobotShop;

public class Wall extends StaticEntity{

	private String type; //TODO make Wall enum
	/**
	 * Class constructor
	 * @param location
	 * @param type
	 */
	public Wall(Location location, String type) {
		super(location);
		this.type = type;
	}
	
	/**
	 * Class constructor. Type will default to default.
	 * @param location
	 */
	public Wall(Location location) {
		super(location);
		this.type = "default";
	}
}
