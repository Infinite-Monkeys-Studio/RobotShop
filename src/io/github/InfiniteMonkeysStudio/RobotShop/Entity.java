package io.github.InfiniteMonkeysStudio.RobotShop;

import java.io.Serializable;

/**
 * This something that exists and can change in the world.
 * @author Quinn
 *
 */
public abstract class Entity implements Drawable, Serializable, Selectable {
	private boolean selected;
	private static final long serialVersionUID = 1L;
	protected Location location;
	/**
	 * Class constructor specifying the location where the entity exists.
	 * @param location The location of the entity
	 */
	public Entity(Location location) {
		this.location = location;
		this.selected = false;
	}
	
	/**
	 * Returns The location of the entity
	 * @return Location of the Entity
	 */
	public Location getLocation() {
		return this.location;
	}
	
	/**
	 * Sets A new location for the Entity.
	 * Returns True if the old and new locations are different.
	 * @param location new location for the Entity
	 * @return boolean If the location changed
	 */
	public boolean setLocation(Location location) {
		if(location == this.location) {
			this.location = location;
			return false;
		} else {
			this.location = location;
			return true;
		}
	}
	
	@Override
	public boolean isSelected() {
		return selected;
	}

	@Override
	public void select() {
		selected = true;
		return;
	}

	@Override
	public void unselect() {
		selected = false;
		return;
	}
}
