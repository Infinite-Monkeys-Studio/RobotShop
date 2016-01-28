package io.github.InfiniteMonkeysStudio.RobotShop.Entities;

import io.github.InfiniteMonkeysStudio.RobotShop.Location;
import io.github.InfiniteMonkeysStudio.RobotShop.Viewport;
import io.github.InfiniteMonkeysStudio.RobotShop.Enums.SupplyType;
import io.github.InfiniteMonkeysStudio.RobotShop.Interfaces.Clickable;
import processing.core.PApplet;
import processing.core.PConstants;

/**
 * A stack of supplies
 * @author Quinn
 *
 */
public class SupplyStack extends PassiveEntity implements Clickable{
	
	private static final long serialVersionUID = 1L;
	private SupplyType type;
	private int quantity;
	private boolean selected;
	
	/**
	 * Class constructor specifying a location and type for the supply stack. 
	 * Quantity will default to 1.
	 * @param location where to place the stack
	 * @param type of stack to create
	 */
	public SupplyStack(Location location, SupplyType type) {
		super(location);
		this.type = type;
		this.quantity = 1;
		setSelected(false);
	}
	
	/**
	 * Class constructor specifying the quantity in the stack.
	 * @param location where to place the stack
	 * @param type of stack to create
	 * @param quantity of items in the stack
	 */
	public SupplyStack(Location location, SupplyType type, int quantity) {
		super(location);
		this.type = type;
		this.quantity = quantity;
		setSelected(false);
	}
	
	/**
	 * Returns the supply type of the stack.
	 * @return type
	 */
	public SupplyType getType() {
		return type;
	}
	
	/**
	 * Sets the type of the supply stack.
	 * The quantity will be unchanged.
	 * Returns true if the new type is different than the original.
	 * @param newType to change the stack to
	 * @return true if the stack is changed by the call
	 */
	public boolean setType(SupplyType newType) {
		if(newType.equals(this.type)) {
			return false;
		} else {
			this.type = newType;
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
	 * Be careful of using this. there is no error checking.
	 * Returns true if the quantity changed because of the call
	 * @param newQuantity to set for the stack
	 * @return true if the stack is changed by the call
	 */
	public boolean setSize(int newQuantity) {
		if(newQuantity == quantity) {
			return false;
		} else {
			quantity = newQuantity;
			return true;
		}
	}
	
	
	public void onClick(float mouseX, float mouseY) {
		setSelected(true);
		return;
	}
	
	/**
	 * Cause the SupplyStack to draw on the canvas
	 * @param canvas the Viewport to draw on
	 */
	@Override
	public void draw(Viewport canvas) {
		String name = "ERROR!";
		float screenX = Location.getScreenX(location);
		float screenY = Location.getScreenY(location);
		final int s = Viewport.SCALE;
		canvas.pushMatrix();
		canvas.translate(screenX, screenY);
		switch(type) {
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
		canvas.fill(0);
		canvas.textAlign(PConstants.CENTER);
		canvas.text("Supply Stack", s/2, 0);
		canvas.text(name, s/2, s/2);
		canvas.popMatrix();
	}

	/**
	 * @return the selected
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * @param selected the selected to set
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	/**
	 * Try to add a supply to the stack
	 * @param supply the supply to add
	 * @return True if it added it, otherwise false.
	 */
	public boolean add(Supply supply) {
		return add(supply, 1);
	}
	
	/**
	 * Try to add a number of supplies to the stack
	 * @param supply the supply to add
	 * @param quantity the number of supplies to add
	 * @return True if it added them, otherwise false.
	 */
	public boolean add(Supply supply, int quantity) {
		// Check it is the same SupplyType.
		if(supply.getType() == this.type) {
			// Can it fit in the stack?
			if(this.quantity + quantity <= this.type.maxStackSize()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void select() {
		this.selected = true;
	}

	@Override
	public void unselect() {
		this.selected = false;
	}

	@Override
	public boolean toggleSelection() {
		this.selected = !this.selected;
		return this.selected;
	}
}
