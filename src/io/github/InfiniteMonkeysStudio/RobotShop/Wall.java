package io.github.InfiniteMonkeysStudio.RobotShop;

public class Wall extends StaticEntity{

	private String type; //TODO make Wall enum
	
	Wall(Location location, Sting type) {
		super(location);
		this.type = type;
		// TODO Auto-generated constructor stub
	}

}
