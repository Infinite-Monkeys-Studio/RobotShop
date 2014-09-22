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
		
		createDummyInitialShop();
		
		return;
	}

	
	void createDummyInitialShop()
	{
		Building b1 = new Building();
		shop.addBuilding(b1);
		
		b1.insertEntity() //// and so on???
		
		
	}

	
	/**
	 * Called once per frame by the PApplet.
	 */
	public void draw() {
		rect(10,10,10,10);
		
		
		return;
	}
	
	
}
