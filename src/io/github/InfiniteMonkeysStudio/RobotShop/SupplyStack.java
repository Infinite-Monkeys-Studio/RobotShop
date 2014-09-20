package io.github.InfiniteMonkeysStudio.RobotShop;
/**
 * A stack of supplys.
 * @author Quinn
 *
 */
public class SupplyStack extends StaticEntity{
	
	private Supply type;
	private int quantity;
	
	/**
	 * Class constructor specifying a location and type for the supply stack. 
	 * quantity will default to 1.
	 * @param location
	 * @param type
	 */
	public SupplyStack(Location location, Supply type) {
		super(location);
		this.type = type;
		this.quantity = 1;
	}
	
	/**
	 * Class construtor specifying the quantity in the stack.
	 * @param location
	 * @param type
	 * @param quantity
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
	 * @param newType
	 * @return 
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
	 * @param newQuantity
	 * @return
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
}
