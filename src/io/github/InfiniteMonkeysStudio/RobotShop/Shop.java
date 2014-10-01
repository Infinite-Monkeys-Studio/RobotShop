package io.github.InfiniteMonkeysStudio.RobotShop;

import java.util.ArrayList;

import processing.core.PApplet;

/**
 * This is the almost the whole world to you.
 * @author Quinn
 *
 */
public class Shop implements Drawable{
	
	private ArrayList<Building> buildingList;
	private int currentBuilding;
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
	 * @param canvis the Viewport to draw on
	 */
	public void draw(Viewport canvis) {
		buildingList.get(currentBuilding).draw(canvis);
	}

	public Building getCurrentBuilding() {
		return buildingList.get(currentBuilding);
	}

	/**
	 * @param currentBuilding the currentBuilding to set
	 */
	public void setCurrentBuilding(int buildingNumber) {
		this.currentBuilding = buildingNumber;
	}
	
	public int getBuildingNumber(Building building) {
		return buildingList.indexOf(building);
	}
	
}
