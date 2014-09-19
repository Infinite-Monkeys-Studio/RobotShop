package io.github.InfiniteMonkeysStudio.RobotShop;

public class Entity {
	
	private Location location;
	/**
	 * Class constructor specifying the location where the entity exists.
	 * @param location The location of the entity
	 */
	public Entity(Location location) {
		this.location = location;
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
}
