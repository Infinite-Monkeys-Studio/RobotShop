package io.github.InfiniteMonkeysStudio.RobotShop;

public class Worker extends MovingEntity{
	
	private Inventory inventory;
	
	Worker(Location location, Inventory inventory) {
		super(location);
		this.inventory = inventory;
		// TODO Auto-generated constructor stub
	}

}
