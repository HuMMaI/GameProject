package game.characters;

public class Character {
	
	private String nick;
	private Characteristics characteristics;
	
	private int level = 0;
	private int xp = 0;
	private int money = 0;
	private int hp = 100;
	
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Characteristics getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(Characteristics characteristics) {
		this.characteristics = characteristics;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	

}
