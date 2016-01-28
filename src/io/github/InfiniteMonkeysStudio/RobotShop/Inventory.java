package io.github.InfiniteMonkeysStudio.RobotShop;

import java.io.Serializable;

import io.github.InfiniteMonkeysStudio.RobotShop.Entities.Supply;
import io.github.InfiniteMonkeysStudio.RobotShop.Entities.SupplyStack;
import io.github.InfiniteMonkeysStudio.RobotShop.Interfaces.Drawable;

/**
 * Represents an inventory.
 * Basically just an array of supply stacks
 * @author Quinn
 */
public class Inventory implements Serializable, Drawable {
	private SupplyStack[] contents;
	// This is only for use by serializable. just to be changed when version changes.
	private static final long serialVersionUID = 1L;
	
	/**
	 * Class constructor
	 * Specifying the initial size of the inventory.
	 * @param size to initialize the inventory to
	 */
	public Inventory(int size) {
		this.contents = new SupplyStack[size];
	}
	
	/**
	 * Class constructor
	 * The inventory size will default to 9.
	 */
	public Inventory() {
		this.contents = new SupplyStack[9];
	}


	@Override
	public void draw(Viewport canvas) {
		// FIXME Write draw function for the inventory
		
	}
	
	public SupplyStack[] getContents() {
		return this.contents;
	}
	
	public void setContents(SupplyStack[] newContents) {
		this.contents = newContents.clone();
	}
	
	public boolean addSupply(Supply supply) {
		boolean inserted = false;
		
		for(SupplyStack ss : contents) {
			if(inserted) break;
			
			if(ss.add(supply)) {
				inserted = true;
			}
		}
		
		return inserted;
	}
}
