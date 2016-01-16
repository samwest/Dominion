package files;
import java.util.Stack;

/*** Used for both the draw deck and discard pile ***/
/* Implement as a stack?
 * 
 * 
 */
public class Deck {
	private int deckSize;
	private Stack<Card> cardList;
	
	/*** Construct a new deck ***/
	public Deck(Player currentPlayer){
		//set variables
		deckSize = 10;
		cardList = new Stack();
		//add copper
		for (int i=0;i < 7;i++){
			Card tempCard = new Card(0,"copper",currentPlayer);
			cardList.push(tempCard);
		}
		//add estates
		for (int i=0;i < 3; i++){
			Card tempCard = new Card(2,"estate",currentPlayer);
			cardList.push(tempCard);
		}
		//call randomizer
		
	}
	
	public Card getTop(){
		return cardList.pop();
	}
	
}
