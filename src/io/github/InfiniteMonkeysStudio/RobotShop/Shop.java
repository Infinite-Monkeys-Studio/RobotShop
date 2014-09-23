package io.github.InfiniteMonkeysStudio.RobotShop;

import java.util.ArrayList;

import processing.core.PApplet;

/**
 * This is the almost the whole world to you.
 * @author Quinn
 *
 */
public class Shop implements Drawable{
	
	ArrayList<Building> buildingList;
	
	Shop() {
		//FIXME make this.
		buildingList = new ArrayList<Building>();
	}
	
	/**
	 * Adds a building to the shop
	 * @param building to add
	 * @return true if the building was not a duplicate.
	 */
	public boolean addBuilding(Building building) {
		return buildingList.add(building);
	}
	
	public void draw(PApplet canvis) {
		for(Building b : buildingList)
			b.draw(canvis);
	}
	
}
