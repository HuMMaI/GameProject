package game.characters;

public class Characteristics {
	private int strength;
	
	private int agility;
	
	private int intelligence;
	
	private int defense;

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	@Override
	public String toString() {
		return "Characteristics [strength=" + strength + ", agility=" + agility + ", intelligence=" + intelligence
				+ ", defense=" + defense + "]";
	}

}
