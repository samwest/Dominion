package files;

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
	
	
	/*** Discard cards from hand***/
	/* Use first parameter to define number of cards to discard. If null, discard all. */
	public void discardCards(Card rmCard){
		//if rmCard is null, discard all cards
		if (rmCard == null){
			for (int i=0;i < size;i++){
				cards.remove();
			}
		}
	}
	
}

