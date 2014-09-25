package io.github.InfiniteMonkeysStudio.RobotShop;

import processing.core.PApplet;

/**
 * The main view window. Also represents the players view in the world.
 * @author Quinn
 *
 */
public class Viewport extends PApplet {

	private static final long serialVersionUID = 1L;
	private Location location; //FIXME Remove this.
	
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
		
		SupplyStack ss1 = new SupplyStack(new Location(200, 100), new Supply(SupplyType.CIRCUITS));
		SupplyStack ss2 = new SupplyStack(new Location(300, 100), new Supply(SupplyType.SHEETMETAL));
		SupplyStack ss3 = new SupplyStack(new Location(400, 100), new Supply(SupplyType.SCRAP));
		SupplyStack ss4 = new SupplyStack(new Location(500, 100), new Supply(SupplyType.REFINEDPLASTICS));
		
		shop.addBuilding(b1);
		
		b1.addEntity(w1);
		b1.addEntity(m1);
		b1.addEntity(wall);
		
		b1.addEntity(ss1);
		b1.addEntity(ss2);
		b1.addEntity(ss3);
		b1.addEntity(ss4);
		
		wall.setExtent(50);
		wall.setNorthSouth(false);
		//ADD More stuff here
	}

	
	/**
	 * Called once per frame by the PApplet.
	 */
	public void draw() {
		background(159,182,205);
		shop.draw(this);
		
		return;
	}
	
	
}
