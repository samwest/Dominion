package files;
/* Created for each player in the game.
 * Has a hand, deck, and discard pile assigned.
 * Also victory point amount.
 * 
 */
public class Player {
	private Hand playerHand;
	private Deck playerDeck;
	private Deck playerDiscard;
	
	/*** Create a new player ***/
	public Player(){
		playerDeck = new Deck(this);
		playerDiscard = new Deck(this);
		playerHand = new Hand(playerDeck);
		
	}
	
}

