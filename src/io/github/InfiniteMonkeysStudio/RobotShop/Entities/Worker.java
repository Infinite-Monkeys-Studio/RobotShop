package io.github.InfiniteMonkeysStudio.RobotShop.Entities;

import io.github.InfiniteMonkeysStudio.RobotShop.Inventory;
import io.github.InfiniteMonkeysStudio.RobotShop.Location;
import io.github.InfiniteMonkeysStudio.RobotShop.Viewport;
import io.github.InfiniteMonkeysStudio.RobotShop.Interfaces.Drawable;
import io.github.InfiniteMonkeysStudio.RobotShop.Interfaces.Selectable;
import processing.core.PApplet;
import processing.core.PConstants;

/**
 * Represents a worker.
 * Could be a robot or human.
 * @author Quinn
 *
 */
public class Worker extends MovingEntity implements Drawable, Selectable {
	
	private static final long serialVersionUID = 1L;
	private Inventory inventory;
	private String name;
	private boolean isSelected;
	
	/**
	 * Class construtor.
	 * @param location of the worker
	 * @param name of the worker
	 * @param inventory to give the worker
	 */
	public Worker(Location location, String name, Inventory inventory) {
		super(location);
		this.setInventory(inventory);
		this.setName(name);
	}
	
	/**
	 * Class constructor
	 * @param location of the worker
	 * @param name of the worker
	 */
	public Worker(Location location, String name) {
		super(location);
		this.setInventory(new Inventory());
		this.setName(name);
	}

	/**
	 * Cause the Worker to draw on the canvas
	 * @param canvas the Viewport to draw on
	 */
	@Override
	public void draw(Viewport canvas) {
		float screenX = Location.getScreenX(location);
		float screenY = Location.getScreenY(location);
		final int s = Viewport.SCALE;
		canvas.pushMatrix();
		canvas.translate(screenX, screenY);
		if(this.isSelected()) {
			canvas.stroke(255, 0, 0);
		} else {
			canvas.stroke(0, 0, 0);
		}
		canvas.fill(100, 100, 255);
		canvas.ellipse(s/2, s/2, s, s);
		canvas.textAlign(PConstants.CENTER);
		canvas.fill(0);
		canvas.text("Worker", s/2, 0);
		canvas.text(name, s/2, s/2);
		canvas.popMatrix();
	}

	/**
	 * @return the inventory
	 */
	public Inventory getInventory() {
		return inventory;
	}

	/**
	 * @param inventory the inventory to set
	 */
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean isSelected() {
		return isSelected;
	}

	@Override
	public void select() {
		isSelected = true;
	}

	@Override
	public void unselect() {
		isSelected = false;		
	}
	
	@Override
	public boolean toggleSelection() {
		isSelected = !isSelected;
		return isSelected;
	}
	
	
}
