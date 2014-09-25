package io.github.InfiniteMonkeysStudio.RobotShop;
/**
 * Represents an object that can be selected
 * @author Quinn
 *
 */

public interface Selectable {
	//public boolean selected;
	
	/**
	 * Test if this object is selected
	 * @return true if selected
	 */
	public boolean isSelected();
	
	/**
	 * Set this object as selected
	 */
	public void select();
	
	/**
	 * Set this object as unselected
	 */
	public void unselect();
}
