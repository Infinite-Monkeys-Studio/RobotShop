package io.github.InfiniteMonkeysStudio.RobotShop;

public class Machine extends StaticEntity{

	private String type; //TODO Make MachineEnum
	Machine(Location location , String type) {
		super(location);
		this.type = type;
		// TODO Auto-generated constructor stub
	}

}
