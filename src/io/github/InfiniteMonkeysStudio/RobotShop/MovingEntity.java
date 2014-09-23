package io.github.InfiniteMonkeysStudio.RobotShop;
/**
 * Represents anything that moves it's self.
 * @author Quinn
 *
 */
public abstract class MovingEntity extends Entity{
	
	private static final long serialVersionUID = 1L;

	/**
	 * Class constructor this is the location of the entity.
	 * @param location
	 */
	public MovingEntity(Location location) {
		super(location);
		// TODO Auto-generated constructor stub
	}

}
