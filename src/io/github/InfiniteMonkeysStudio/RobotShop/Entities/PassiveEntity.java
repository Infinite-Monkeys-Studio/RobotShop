package io.github.InfiniteMonkeysStudio.RobotShop.Entities;

import io.github.InfiniteMonkeysStudio.RobotShop.Location;

/**
 * This represents an entity that cannot move it's self
 * @author Quinn
 *
 */
public abstract class PassiveEntity extends Entity{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Class constructor specifying the location of the entity
	 * @param location where to place the entity
	 */
	public PassiveEntity(Location location) {
		super(location);
	}
	
}
