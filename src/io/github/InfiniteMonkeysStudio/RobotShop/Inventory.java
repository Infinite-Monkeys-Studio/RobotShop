package io.github.InfiniteMonkeysStudio.RobotShop;

public class Inventory {
	private SupplyStack[] contents;
	
	Inventory(int size) {
		this.contents = new SupplyStack[size];
	}
}
