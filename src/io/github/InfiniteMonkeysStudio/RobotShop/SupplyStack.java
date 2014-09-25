package io.github.InfiniteMonkeysStudio.RobotShop;

import processing.core.PApplet;

/**
 * A stack of supplys.
 * @author Quinn
 *
 */
public class SupplyStack extends PassiveEntity{
	
	private static final long serialVersionUID = 1L;
	private Supply type;
	private int quantity;
	
	/**
	 * Class constructor specifying a location and type for the supply stack. 
	 * Quantity will default to 1.
	 * @param location where to place the stack
	 * @param type of stack to create
	 */
	public SupplyStack(Location location, Supply type) {
		super(location);
		this.type = type;
		this.quantity = 1;
	}
	
	/**
	 * Class constructor specifying the quantity in the stack.
	 * @param location where to place the stack
	 * @param type of stack to create
	 * @param quantity of items in the stack
	 */
	public SupplyStack(Location location, Supply type, int quantity) {
		super(location);
		this.type = type;
		this.quantity = quantity;
	}
	
	/**
	 * Returns the supply type of the stack.
	 * @return type
	 */
	public Supply getType() {
		return type;
	}
	
	/**
	 * Sets the type of the supply stack.
	 * The quantity will be unchanged.
	 * Returns true if the new type is different than the original.
	 * @param newType to change the stack to
	 * @return true if the stack is changed by the call
	 */
	public boolean setType(Supply newType) {
		if(newType.equals(this.type)) {
			this.type = newType;
			return false;
		} else {
			this.type = newType;
			return true;
		}
	}
	
	/**
	 * Returns the size of the supply stack.
	 * @return int
	 */
	public int getSize() {
		return quantity;
	}
	
	/**
	 * Sets the quantity for the stack.
	 * Returns true if the quantity changed because of the call
	 * @param newQuantity to set for the stack
	 * @return true if the stack is changed by the call
	 */
	public boolean setSize(int newQuantity) {
		if(newQuantity == quantity) {
			quantity = newQuantity;
			return false;
		} else {
			quantity = newQuantity;
			return true;
		}
	}

	@Override
	public void draw(PApplet canvas) {
		// TODO Auto-generated method stub
		
	}
}
