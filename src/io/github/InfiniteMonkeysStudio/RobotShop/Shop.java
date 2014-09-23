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
	
	/**
	 * Class constructor
	 */
	Shop() {
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
	
	/**
	 * Draws the entire shop
	 * Works by calling draw on all the buildings in the shop
	 * @param PApplet the canvas to draw on
	 */
	public void draw(PApplet canvis) {
		for(Building b : buildingList)
			b.draw(canvis);
	}
	
}
