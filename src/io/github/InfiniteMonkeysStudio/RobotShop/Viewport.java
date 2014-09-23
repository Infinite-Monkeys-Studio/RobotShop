package io.github.InfiniteMonkeysStudio.RobotShop;

import processing.core.PApplet;

/**
 * The main view window. Also represents the players view in the world.
 * @author Quinn
 *
 */
public class Viewport extends PApplet {

	private Location location; //viewport location
	
	Shop shop;
	
	/**
	 * Called once at the start of the PApplet.
	 */
	public void setup() {
		size(800, 500);
		
		// create the shop
		shop = new Shop();
		
		createDummyInitialShop(); //DO Add loading and saving
		
		return;
	}

	
	void createDummyInitialShop()
	{
		Building b1 = new Building();
		Worker w1 = new Worker(new Location(5, 5));
		shop.addBuilding(b1);
		
		b1.addEntity(w1);
		//ADD More stuff here
		
	}

	
	/**
	 * Called once per frame by the PApplet.
	 */
	public void draw() {
		shop.draw(this);
		
		return;
	}
	
	
}
