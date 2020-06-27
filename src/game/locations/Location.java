package game.locations;

import java.util.List;

public class Location {
	
	private String name;
	
	private List<City> cities;
	
	private List<EnemyTerritory> enemyTerritories;
	
	private List<Dungeon> dengeons;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public List<EnemyTerritory> getEnemyTerritories() {
		return enemyTerritories;
	}

	public void setEnemyTerritories(List<EnemyTerritory> enemyTerritories) {
		this.enemyTerritories = enemyTerritories;
	}

	public List<Dungeon> getDengeons() {
		return dengeons;
	}

	public void setDengeons(List<Dungeon> dengeons) {
		this.dengeons = dengeons;
	}
	
}
