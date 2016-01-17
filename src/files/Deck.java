package files;
import java.util.*;

/*** Used for both the draw deck and discard pile ***/
/* Implement as a stack?
 * 
 * 
 */
public class Deck {
	private int deckSize;
	private Stack<Card> cardList;
	
	/*** Construct a new deck ***/
	public Deck(){
		//set variables
		deckSize = 10;
		cardList = new Stack<Card>();
		//add copper
		for (int i=0;i < 7;i++){
			Card tempCard = new Card(0,"copper",1,false,false,true,false);
			cardList.push(tempCard);
		}
		//add estates
		for (int i=0;i < 3; i++){
			Card tempCard = new Card(2,"estate",1,false,true,false,false);
			cardList.push(tempCard);
		}
		//call randomizer
	}
	
	public void printDeck() {
		Card[] cardArray;
		int startSize=deckSize;
		// allocates memory for 10 integers
        cardArray = new Card[startSize];
        for (int i = 0; i < startSize;i++) {
        	cardArray[i]=this.getTop();
        	System.out.println(cardArray[i].getDesc());
        }
        for (int j = startSize-1; j>=0;j--) {
        	this.addCard(cardArray[j]);
        }
	}
	
	public void ranomizeDeck(){
		
		Collections.shuffle(cardList);
		/*Card[] cardArray;
		Card tmpCard;

        // allocates memory for 10 integers
        cardArray = new Card[deckSize];
		
        for (int i = 0; i < deckSize;i++) {
        	tmpCard <- this.getTop()
        	cardArray[i]= 
        }
		
		public Vector<Card> cardVector = new Vector<Card>(deckSize);
		while (!cardList.empty()){
						
		}*/
	}
	
	
	public int getDeckSize(){
		return deckSize;
	}
	
	
	
	public Card getTop(){
		deckSize--;
		return cardList.pop();
	}
	
	public void addCard(Card c){
		deckSize++;
		cardList.push(c);
	}
	
}
