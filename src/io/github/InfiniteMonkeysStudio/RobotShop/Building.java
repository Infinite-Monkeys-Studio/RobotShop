package io.github.InfiniteMonkeysStudio.RobotShop;

import java.util.ArrayList;

import processing.core.PApplet;

/**
 * This is a section of the shop.
 * @author Quinn
 *
 */
public class Building implements Drawable{
	
	ArrayList<Entity> entityList;
	
	private String name;
	private String type;//TODO write an enum
	/**
	 * Class constructor Type will be "default."
	 * @param name
	 */
	public Building(String name) {
		this.name = name;
		this.type = "Default";
	}
	
	/**
	 * Class constructor Setting the name and type of the building.
	 * @param name
	 * @param type
	 */
	public Building(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	/**
	 * Class constructor.
	 * Name defaults to NULL
	 * Type defaults to default
	 */
	public Building() {
		this.name = null;
		this.type = "Default";
	}
	
	/**
	 * Add an entity to this building.
	 * The entity will be placed at it's location
	 * @param entity
	 * @return true if this building changed as a result of the call
	 */
	public boolean addEntity(Entity entity) {
		return entityList.add(entity);
	}

	@Override
	public void draw(PApplet canvas) {
		for(Entity e : entityList)
			e.draw(canvas);
	}
}
