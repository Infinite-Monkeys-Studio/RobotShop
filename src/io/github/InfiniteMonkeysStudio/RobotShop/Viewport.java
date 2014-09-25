package io.github.InfiniteMonkeysStudio.RobotShop;

import processing.core.PApplet;

/**
 * The main view window. Also represents the players view in the world.
 * @author Quinn
 *
 */
public class Viewport extends PApplet {

	private static final long serialVersionUID = 1L;
	private Location location; //viewport location
	
	private Shop shop;
	
	/**
	 * Called once at the start of the PApplet.
	 */
	public void setup() {
		size(800, 500);
		
		// create the shop
		shop = new Shop();
		this.getParent().getParent().setName("Robot Shop");
		this.getParent().setName("Robot Shop");
		createDummyInitialShop(); //DO Add loading and saving
		
		return;
	}

	private void createDummyInitialShop() {
		Building b1 = new Building();
		Worker w1 = new Worker(new Location(100, 100), "Phil");
		Machine m1 = new Machine(new Location(400, 300), "Example");
		Wall wall = new Wall(new Location(200,150));
		
		shop.addBuilding(b1);
		
		b1.addEntity(w1);
		b1.addEntity(m1);
		b1.addEntity(wall);
		
		wall.setExtent(50);
		wall.setNorthSouth(false);
		//ADD More stuff here
	}

	
	/**
	 * Called once per frame by the PApplet.
	 */
	public void draw() {
		background(237, 201, 175);
		shop.draw(this);
		
		return;
	}
	
	
}
