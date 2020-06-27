package game.locations;

import game.characters.Blacksmith;
import game.characters.Dealer;

public class City {
	
	private String name;	
	private Dealer dealer;
	private Blacksmith blacksmith;
	
	public Dealer getDealer() {
		return dealer;
	}
	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	public Blacksmith getBlacksmith() {
		return blacksmith;
	}
	public void setBlacksmith(Blacksmith blacksmith) {
		this.blacksmith = blacksmith;
	}
	
	

}
