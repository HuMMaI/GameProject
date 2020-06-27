package game.locations;

import java.util.List;
import java.util.Map;

import game.characters.Monster;

public class Dungeon {

	private String name;
	
	private int numOfStages;
	
	private Map<Integer, List<Monster>> monsters;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfStages() {
		return numOfStages;
	}

	public void setNumOfStages(int numOfStages) {
		this.numOfStages = numOfStages;
	}

	public Map<Integer, List<Monster>> getMonsters() {
		return monsters;
	}

	public void setMonsters(Map<Integer, List<Monster>> monsters) {
		this.monsters = monsters;
	}
	
	
	
}
