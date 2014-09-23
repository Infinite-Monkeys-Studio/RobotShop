package io.github.InfiniteMonkeysStudio.RobotShop;

import processing.core.PApplet;
import processing.core.PConstants;

/**
 * Represents a worker.
 * Could be a robot or human.
 * @author Quinn
 *
 */
public class Worker extends MovingEntity{
	
	private static final long serialVersionUID = 1L;
	private Inventory inventory;
	
	/**
	 * Class construtor.
	 * @param location of the worker
	 * @param inventory to give the worker
	 */
	public Worker(Location location, Inventory inventory) {
		super(location);
		this.setInventory(inventory);
	}
	
	public Worker(Location location) {
		super(location);
		this.setInventory(new Inventory());
	}

	@Override
	public void draw(PApplet canvas) {
		canvas.pushMatrix();
		canvas.translate((float) location.getX(), (float) location.getY());
		canvas.textAlign(PConstants.CENTER);
		canvas.fill(0);
		canvas.text("Worker", 0, -6);
		canvas.fill(100, 100, 255);
		canvas.ellipse(0, 0, 10, 10);
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
}
