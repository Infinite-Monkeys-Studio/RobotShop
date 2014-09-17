package io.github.InfiniteMonkeysStudio.RobotShop;

public class SupplyStack {
	
	private Supply type;
	private int quantity;
	
	SupplyStack(Supply type) {
		this.type = type;
		this.quantity = 1;
	}
	
	SupplyStack(Supply type, int quantity) {
		this.type = type;
		this.quantity = quantity;
	}
}
