package io.github.InfiniteMonkeysStudio.RobotShop.Entities;

import io.github.InfiniteMonkeysStudio.RobotShop.Enums.SupplyType;

/**
 * A single supply.
 * @author Quinn
 *
 */
public class Supply {
	
	private SupplyType type;
	
	/**
	 * Class constructor Specifying the type of the supply
	 * @param type of supply
	 */
	public Supply(SupplyType type){
		this.setType(type);
	}
	
	/**
	 * Class constructor.
	 * Type will be SCRAP.
	 */
	public Supply() {
		this.setType(SupplyType.SCRAP);
	}

	/**
	 * @return the type
	 */
	public SupplyType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(SupplyType type) {
		this.type = type;
	}
}
