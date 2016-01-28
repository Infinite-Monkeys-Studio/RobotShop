package io.github.InfiniteMonkeysStudio.RobotShop.Interfaces;

/**
 * Represents an object that can be selected
 * @author Quinn
 *
 */
public interface Selectable {
	
	/**
	 * Test if this object is selected
	 * @return true if selected
	 */
	public boolean isSelected();
	
	/**
	 * Toggles the state of selection
	 * @return new state of selection
	 */
	public boolean toggleSelection();
	
	/**
	 * Set this object as selected
	 */
	public void select();
	
	/**
	 * Set this object as unselected
	 */
	public void unselect();
}
