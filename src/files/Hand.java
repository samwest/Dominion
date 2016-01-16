package files;

import java.util.Iterator;
import java.util.LinkedList;

/* One assigned to each Player class
 * Singly linked list of cards. Cards are not removed from the deck.
 * 
 * 
 */
public class Hand {
	private int size;
	private Deck handDeck;
	private LinkedList<Card> cards;
	
	/*** Create new hand ***/
	public Hand(Deck d){
		//set private variables
		size =0;
		handDeck = d;
		cards = new LinkedList();
		//Draw first 5 cards
		for (int i=0;i < 5; i++){
			drawCard();
		}
	}
	
	/*** Draw one card ***/
	public void drawCard(){
		//pop one card from deck and add to hand
		cards.addFirst(handDeck.getTop());
		size++;
	}
	
	/*** Play a card from hand***/
	/*
	 * Takes in a string as input, finds the first matching card, and then passes card object
	 * into Played.
	 */
	public void playCard(String desc){
		//iterate through hand
		Iterator<Card> iterHand = cards.iterator();
		while (iterHand.hasNext()){
			//get descriptor for the next card in the list
			String cardName = iterHand.next().getDesc();
			if (cardName.equals(desc)){
				//remove from hand
				iterHand.remove();
				//call method to add to Played object
				return;
			}
		}
	}
	
}

