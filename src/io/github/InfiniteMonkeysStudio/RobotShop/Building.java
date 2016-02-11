package io.github.InfiniteMonkeysStudio.RobotShop;

import io.github.InfiniteMonkeysStudio.RobotShop.Entities.Entity;
import io.github.InfiniteMonkeysStudio.RobotShop.Enums.BuildingType;
import io.github.InfiniteMonkeysStudio.RobotShop.Interfaces.Drawable;

import java.io.Serializable;
import java.util.ArrayList;

import processing.core.PApplet;

/**
 * This is a section of the shop.
 * @author Quinn
 *
 */
public class Building implements Drawable, Serializable {
	
	private int ID;
	private ArrayList<Entity> entityList;
	private String name;
	private BuildingType type;
	// this is only for use by serializable. just to be changed when version changes.
	private static final long serialVersionUID = 1L;
		
	/**
	 * Class constructor Setting the name and type of the building.
	 * @param name of the building
	 * @param type of the building
	 */
	public Building(String name, BuildingType type) {
		this.name = name;
		this.type = type;
		entityList = new ArrayList<Entity>();
	}
	
	/**
	 * Class constructor.
	 * Name defaults to NULL
	 * Type defaults to none
	 */
	public Building() {
		this.name = null;
		this.type = BuildingType.NONE;
		entityList = new ArrayList<Entity>();
	}
	
	/**
	 * Class constructor 
	 * Type will be none
	 * @param name of the building
	 */
	public Building(String name) {
		this.name = name;
		this.type = BuildingType.NONE;
		entityList = new ArrayList<Entity>();
	}
	
	/**
	 * Add an entity to this building.
	 * The entity will be placed at it's location
	 * @param entity the entity to add
	 * @return true if this building changed as a result of the call
	 */
	public boolean addEntity(Entity entity) {
		return entityList.add(entity);
	}

	/**
	 * Renders the building at the world location.
	 * @param canvas The Canvas to draw the building in.
	 * @return void
	 */
	@Override
	public void draw(Viewport canvas) {
		canvas.pushMatrix();
		canvas.stroke(0, 0, 0);
		
		for(int x = 0; x < canvas.width; x += Viewport.SCALE) {
			canvas.line(x, 0, x, canvas.height);
		}
		
		for(int y = 0; y < canvas.height; y += Viewport.SCALE) {
			canvas.line(0, y, canvas.width, y);
		}
		canvas.popMatrix();
		for(Entity e : entityList)
			e.draw(canvas);
	}

	/**
	 * Get the entity at a location
	 * @param location to look for entity
	 * @return Entity at location, null if no entity at that location
	 */
	public Entity getEntityAt(Location location) {
		for(Entity e : entityList) {
			if (e.getLocation().sameAs(location)) {
				return e;
			}
		}
		return null;
	}

	/**
	 * Get all entities
	 * @return ArrayList<Entity> all selected entities, null if contains no entities
	 */
	public ArrayList<Entity> getAllEntities() {
		ArrayList<Entity> eList = (ArrayList<Entity>) this.entityList.clone();
		return eList;		
	}
	
	/**
	 * Returns the building type of this building.
	 * @return BuildingType This building's type
	 */
	public BuildingType getType() {
		return this.type;
	}
	
	/**
	 * Returns this buildings name. This is not unique. only cosmetic
	 * @return String This building's cosmetic name.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Sets the building's name.
	 * @param newName The new name for the building.
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	
	/**
	 * Sets the building's type to match.
	 * Be careful with this.
	 * @param newType The new type for the building.
	 */
	public void setType(BuildingType newType) {
		this.type = newType;
	}
}
