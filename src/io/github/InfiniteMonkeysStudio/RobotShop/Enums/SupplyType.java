package io.github.InfiniteMonkeysStudio.RobotShop.Enums;

/**
 * Represents a type of supply
 * @author Quinn
 *
 */
public enum SupplyType {
	SCRAP			(10),
	SHEETMETAL		(10),
	REFINEDPLASTICS	(10),
	CIRCUITS		(10);
	
	private final int maxStackSize;
	
	SupplyType(int stackSize) {
		this.maxStackSize = stackSize;
	}
	
	public int maxStackSize() {
		return this.maxStackSize;
	}
	
	//ADD methods
}