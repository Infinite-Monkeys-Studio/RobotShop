package io.github.InfiniteMonkeysStudio.RobotShop;

import java.io.Serializable;

import io.github.InfiniteMonkeysStudio.RobotShop.Entities.SupplyStack;

/**
 * Represents an inventory.
 * Basically just an array of supply stacks
 * @author Quinn
 */
public class Inventory implements Serializable {
	private SupplyStack[] contents;
	// this is only for use by serializable. just to be changed when version changes.
	private static final long serialVersionUID = 1L;
	
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
