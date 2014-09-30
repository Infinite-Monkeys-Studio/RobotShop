package io.github.InfiniteMonkeysStudio.RobotShop;

import processing.core.PApplet;
import processing.core.PConstants;

/**
 * A stack of supplies
 * @author Quinn
 *
 */
public class SupplyStack extends PassiveEntity{
	
	private static final long serialVersionUID = 1L;
	private Supply supply;
	private int quantity;
	
	/**
	 * Class constructor specifying a location and type for the supply stack. 
	 * Quantity will default to 1.
	 * @param location where to place the stack
	 * @param type of stack to create
	 */
	public SupplyStack(Location location, Supply type) {
		super(location);
		this.supply = type;
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
		this.supply = type;
		this.quantity = quantity;
	}
	
	/**
	 * Returns the supply type of the stack.
	 * @return type
	 */
	public Supply getType() {
		return supply;
	}
	
	/**
	 * Sets the type of the supply stack.
	 * The quantity will be unchanged.
	 * Returns true if the new type is different than the original.
	 * @param newType to change the stack to
	 * @return true if the stack is changed by the call
	 */
	public boolean setType(Supply newType) {
		if(newType.equals(this.supply)) {
			this.supply = newType;
			return false;
		} else {
			this.supply = newType;
			return true;
		}
	}
	
	/**
	 * Returns the size of the supply stack.
	 * @return the number of supplies in this stack
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

	/**
	 * Cause the SupplyStack to draw on the canvas
	 * @param canvas the Viewport to draw on
	 */
	@Override
	public void draw(Viewport canvas) {
		String name = "ERROR!";
		float screenX = canvas.getScreenX(location);
		float screenY = canvas.getScreenY(location);
		final int s = Viewport.getScale();
		
		canvas.pushMatrix();
		canvas.translate(screenX, screenY);
		canvas.fill(0);
		canvas.textAlign(PConstants.CENTER);
		canvas.text("Supply Stack", s/2, 0);
		switch(supply.getType()) {
		case CIRCUITS:
			name = "Circuits";
			canvas.fill(0,128,0);
			break;
		case REFINEDPLASTICS:
			name = "Refined Plastics";
			canvas.fill(255,235,205);
			break;
		case SCRAP:
			name = "Scrap";
			canvas.fill(74,74,74);
			break;
		case SHEETMETAL:
			name = "Sheet Metal";
			canvas.fill(0,46,61);
			break;
		default:
			name = "ERROR!";
			canvas.fill(255,0,0);
			break;
		}
		canvas.rect(0, 0, s, s);
		canvas.text(name, s/2, s/2);
		canvas.popMatrix();
	}
}
