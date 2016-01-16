package files;

import java.util.Stack;

public class Played {
	private int numPlayed;
	private Stack<Card> cardsPlayed;
		
	public Played() {
		numPlayed=0;
		cardsPlayed = new Stack<Card>();	
	}
	
	public void addCard(Card cardPlayed) {
		cardsPlayed.push(cardPlayed);
		numPlayed++;
	}
	
	public int getNumPlayed() {
		return numPlayed;
	}
	
	
	
}
