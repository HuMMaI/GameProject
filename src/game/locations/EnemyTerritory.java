package game.locations;

import java.util.List;

import game.characters.Monster;

public class EnemyTerritory {
	
	private String name;	
	private List <Monster> monster;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Monster> getMonster() {
		return monster;
	}
	public void setMonster(List<Monster> monster) {
		this.monster = monster;
	}
	
	
	
	
	

}
