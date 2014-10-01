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
	private String name;
	private boolean selected;
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
	
	
}
