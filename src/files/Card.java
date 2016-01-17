package files;
/* An object for each individual card in the game. 
 * A card object is not constructed until it's part of a player's deck.
 * Has a cost variable.
 * Has a unique descriptor.
 * 
 */
public class Card {
	private int cost;
	private String desc;
	private int turnsRemaining;
	private int totalTurns;
	private boolean isAction;
	private boolean isVictory;
	private boolean isTreasure;
	private boolean isReaction;
	
	
	
	
	/*** Create a new Card Object ***/
	public Card(int cardCost,String descriptor,int turns, boolean isAct,boolean isVic,boolean isTreas,boolean isReac){
		cost = cardCost;
		desc = descriptor;
		totalTurns=turns;
		turnsRemaining=turns;
		isAction = isAct;
		isVictory = isVic;
		isTreasure = isTreas;
		isReaction = isReac;
		
	}
	
	
	// Called when the card is being added back to a deck or trashed
	public void prepCardForDiscard() {
		turnsRemaining=totalTurns;
	}
	
	
	// use a turn when the card is played
	public void useTurn(){
		turnsRemaining--;
	}
	
	// the number of turns remaining for the card
	public int numRemaining() {
		return turnsRemaining;
	}
	
	// if the card is an action card
	public boolean isAction () {
		return isAction;
	}
	
	// if the card is a victory card
	public boolean isVictory() {
		return isVictory;
	}
	
	// if the card is a treasure car
	public boolean isTreasure() {
		return isTreasure;
	}
	
	// if the card is a reaction card
	public boolean isReaction() {
		return isReaction;
	}
	/*** Get the cost back ***/
	public int getCost(){
		return cost;
	}
	
	/*** Get the descriptor ***/
	public String getDesc(){
		return desc;
	}
	
	/*** Run the logic for this particular card ***/
	public void runCard(){
		
	}
	
	
	/***** Include logic for individual cards ***/
	
	
	
	
}

