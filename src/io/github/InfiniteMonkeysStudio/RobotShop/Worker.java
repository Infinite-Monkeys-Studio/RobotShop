package io.github.InfiniteMonkeysStudio.RobotShop;

import processing.core.PApplet;

/**
 * Represents a worker.
 * Could be a robot or human.
 * @author Quinn
 *
 */
public class Worker extends MovingEntity{
	
	private Inventory inventory;
	
	/**
	 * Class construtor.
	 * @param location Location of the worker
	 * @param inventory
	 */
	public Worker(Location location, Inventory inventory) {
		super(location);
		this.inventory = inventory;
	}
	
	public Worker(Location location) {
		super(location);
		this.inventory = new Inventory();
	}

	@Override
	public void draw(PApplet canvas) {
		canvas.pushMatrix();
		canvas.translate((float) location.getX(), (float) location.getY());
		canvas.rect(0,0,10,10);
		canvas.popMatrix();
	}
}
