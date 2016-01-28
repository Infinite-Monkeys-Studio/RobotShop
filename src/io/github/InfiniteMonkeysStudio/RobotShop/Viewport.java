package io.github.InfiniteMonkeysStudio.RobotShop;

import io.github.InfiniteMonkeysStudio.RobotShop.Entities.Entity;
import io.github.InfiniteMonkeysStudio.RobotShop.Entities.Machine;
import io.github.InfiniteMonkeysStudio.RobotShop.Entities.Supply;
import io.github.InfiniteMonkeysStudio.RobotShop.Entities.SupplyStack;
import io.github.InfiniteMonkeysStudio.RobotShop.Entities.Wall;
import io.github.InfiniteMonkeysStudio.RobotShop.Entities.Worker;
import io.github.InfiniteMonkeysStudio.RobotShop.Enums.SupplyType;

import java.util.ArrayList;

import processing.core.PApplet;

/**
 * The main view window. Also represents the players view in the world.
 * @author Quinn
 *
 */
public class Viewport extends PApplet {

	private static final long serialVersionUID = 1L;
	private Location location; //FIXME Remove this.
	public static final int SCALE = 45;
	
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
		createDummyInitialShop();
		
		return;
	}

	private void createDummyInitialShop() {
		Building b1 = new Building();
		Worker w1 = new Worker(new Location(4, 4), "Phil");
		Machine m1 = new Machine(new Location(10, 10), "Example");
		Wall wall = new Wall(new Location(3,2));
		
		SupplyStack ss1 = new SupplyStack(new Location(2, 1), SupplyType.CIRCUITS);
		SupplyStack ss2 = new SupplyStack(new Location(3, 1), SupplyType.SHEETMETAL);
		SupplyStack ss3 = new SupplyStack(new Location(4, 1), SupplyType.SCRAP);
		SupplyStack ss4 = new SupplyStack(new Location(5, 1), SupplyType.REFINEDPLASTICS);
		
		shop.addBuilding(b1);
		shop.getBuildingNumber(b1);
		shop.setCurrentBuilding(shop.getBuildingNumber(b1));
		
		b1.addEntity(w1);
		b1.addEntity(m1);
		b1.addEntity(wall);
		
		b1.addEntity(ss1);
		b1.addEntity(ss2);
		b1.addEntity(ss3);
		b1.addEntity(ss4);
		
		wall.setExtent(2);
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
	
	public void mouseClicked() {
		println("Click at x:" + this.mouseX + " y:" + this.mouseY);
		Location loc = Location.getLocation(this.mouseX, this.mouseY);
		println("Location is:" + loc.toString());
		
		if(shop.getCurrentBuilding().getEntityAt(loc) == null) {
			ArrayList<Entity> entityList = shop.getCurrentBuilding().getAllEntity();
			println("empty space");
			if(entityList != null) {
				for(Entity e : entityList)
					e.setLocation(loc);
				println("moved " + entityList.size() + " entity");
			}
		} else {
			Entity e = shop.getCurrentBuilding().getEntityAt(loc);
			println("Selected Entity");
			if(e.isSelected())
				e.unselect();
			else
				e.select();
		}
	}
}
