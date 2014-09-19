package io.github.InfiniteMonkeysStudio.RobotShop;

public class Worker extends MovingEntity{
	
	private Inventory inventory;
	
	/**
	 * Class construtor.
	 * @param location Location of the worker
	 * @param inventory
	 */
	public Worker(Location location, Inventory inventory) {
		super(location);
		this.inventory = inventory;
	}
	
	public Worker(Location location) {
		super(location);
		this.inventory = new Inventory();
	}

}
