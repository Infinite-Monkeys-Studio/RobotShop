package io.github.InfiniteMonkeysStudio.RobotShop;

import io.github.InfiniteMonkeysStudio.RobotShop.Entities.Entity;
import io.github.InfiniteMonkeysStudio.RobotShop.Entities.Machine;
import io.github.InfiniteMonkeysStudio.RobotShop.Entities.SupplyStack;
import io.github.InfiniteMonkeysStudio.RobotShop.Entities.Wall;
import io.github.InfiniteMonkeysStudio.RobotShop.Entities.Worker;
import io.github.InfiniteMonkeysStudio.RobotShop.Enums.SupplyType;

import java.io.Serializable;
import java.util.ArrayList;

import processing.awt.PSurfaceAWT;
import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;
import processing.core.PSurface;

/**
 * The main view window. Also represents the players view in the world.
 * @author Quinn
 *
 */
public class Viewport extends PApplet implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final int SCALE = 45;
	
	private Shop shop;
	
	private ArrayList<Character> pressedKeys = new ArrayList<Character>();
	
	public static void main(String[] args) {
        String[] a = {"MAIN"};
        PApplet.runSketch( a, new Viewport());
    }
	
	public void settings() {
		size(800, 600);
	}
	
	/**
	 * Called once at the start of the PApplet.
	 */
	public void setup() {
		this.getSurface().setTitle("Robot Shop");
		this.getSurface().setIcon(loadImage("titleBarIcon.png"));
		
		// Create the shop
		shop = new Shop();
		createDummyInitialShop();
	}

	private void createDummyInitialShop() {
		Building b1 = new Building();
		Worker w1 = new Worker(new Location(4, 4), "Phil");
		Machine m1 = new Machine(new Location(10, 10), "Example");
		Wall wall = new Wall(new Location(3,2));
		
		SupplyStack ss1 = new SupplyStack(new Location(2, 5), SupplyType.CIRCUITS);
		SupplyStack ss2 = new SupplyStack(new Location(3, 5), SupplyType.SHEETMETAL);
		SupplyStack ss3 = new SupplyStack(new Location(4, 5), SupplyType.SCRAP);
		SupplyStack ss4 = new SupplyStack(new Location(5, 5), SupplyType.REFINEDPLASTICS);
		
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
		resetMatrix();
		background(159,182,205);
		
		shop.draw(this);
		return;
	}
	
	public void mouseClicked() {
		println("Click at x:" + this.mouseX + " y:" + this.mouseY);
		Location loc = Location.getLocation(this.mouseX, this.mouseY);
		println("Location is:" + loc.toString());
		
		Entity entity = shop.getCurrentBuilding().getEntityAt(loc);
		if(entity == null) {
			ArrayList<Entity> entityList = shop.getCurrentBuilding().getAllEntities();
			println("empty space");
			if(entityList != null) {
				int i =0;
				for(Entity e : entityList) {
					if(e.isSelected()) {
						e.setLocation(loc);
						i++;
					}
				}
				println("moved " + i + " entity");
			}
		} else {
			println("Selected Entity");
			entity.toggleSelection();
		}
	}
	
	public void keyPressed() {
		if(!pressedKeys.contains(key)) {
			pressedKeys.add(key);
		}
	}
	
	public void keyReleased() {
		if(pressedKeys.contains(key)) {
			pressedKeys.remove(pressedKeys.indexOf(key));
		}
	}
}
