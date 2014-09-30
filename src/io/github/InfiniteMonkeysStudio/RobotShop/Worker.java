package io.github.InfiniteMonkeysStudio.RobotShop;

import processing.core.PApplet;
import processing.core.PConstants;

/**
 * Represents a worker.
 * Could be a robot or human.
 * @author Quinn
 *
 */
public class Worker extends MovingEntity implements Selectable{
	
	private static final long serialVersionUID = 1L;
	private Inventory inventory;
	private String name;
	private boolean selected;
	/**
	 * Class construtor.
	 * @param location of the worker
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

	@Override
	public void draw(Viewport canvas) {
		canvas.pushMatrix();
		canvas.translate((float) location.getX(), (float) location.getY());
		canvas.textAlign(PConstants.CENTER);
		canvas.fill(0);
		canvas.text("Worker", 0, -6);
		canvas.text(name, 0, 17);
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
