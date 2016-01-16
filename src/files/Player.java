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
	
	/*** Get this player's deck ***/
	public Deck getDeck(){
		return playerDeck;
	}
	
	/*** Get this player's discard ***/
	public Deck getDiscard(){
		return playerDiscard;
	}
	
	/*** Get this player's Hand ***/
	public Hand getHand(){
		return playerHand;
	}
	
}

