package io.github.InfiniteMonkeysStudio.RobotShop;

/**
 * Represents an inventory.
 * Basically just an array of supply stacks
 */
public class Inventory {
	private SupplyStack[] contents;
	
	/**
	 * Class constructor specifying the initial size of the inventory.
	 * @param size to initialize the inventory to
	 */
	public Inventory(int size) {
		this.contents = new SupplyStack[size];
	}
	
	/**
	 * Class constructor. The inventory size will default to 9.
	 */
	public Inventory() {
		this.contents = new SupplyStack[9];
	}
}
