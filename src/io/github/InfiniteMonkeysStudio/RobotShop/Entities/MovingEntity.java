package io.github.InfiniteMonkeysStudio.RobotShop.Entities;

import io.github.InfiniteMonkeysStudio.RobotShop.Location;
import io.github.InfiniteMonkeysStudio.RobotShop.Interfaces.Selectable;

/**
 * Represents anything that moves it's self.
 * @author Quinn
 *
 */
public abstract class MovingEntity extends Entity implements Selectable{
	
	private static final long serialVersionUID = 1L;

	/**
	 * Class constructor this is the location of the entity.
	 * @param location where to place the entity
	 */
	public MovingEntity(Location location) {
		super(location);
	}

}
