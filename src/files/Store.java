package files;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*** Array of bags of cards ***/
/*
 * Constructor creates all of the needed card objects with the store.
 * 
 */
public class Store {
	private int arraySize;
	private int stackSize;
	
	
	/*** Create a new Store from file ***/
	/*
	 * Will pass exceptions up to be caught in PlayGame
	 */
	public Store(Scanner input,int numPlayers){
		//Create array of stacks
		ArrayList<Stack> cardArry = new ArrayList<Stack>(20);
		//Initialize stack array position counter
		int arrayPos;
		//start moving through lines in the file
		while (input.hasNextLine()){
			//Create input string
			String fullString = input.nextLine();
			ArrayList<String> items = new ArrayList<String>(Arrays.asList(fullString.splits(",")));
			//Line format: Cost,Descriptor,Turns,isAct,isVic,isTreas,isReac
			//Fix variable types
			int cost = Integer.valueOf((items.get(0)));
			String desc = items.get(1);
			int turns = Integer.valueOf(items.get(2));
			boolean isAct = Boolean.getBoolean(items.get(3));
			boolean isVic = Boolean.getBoolean(items.get(4));
			boolean isTreas = Boolean.getBoolean(items.get(5));
			boolean isReac = Boolean.getBoolean(items.get(6));
			//Special handling for treasure cards
			//Determine stackSize
			if (isVic){
				if (numPlayers == 2){
					stackSize = 8;
				}
				else {
					stackSize = 12;
				}
				for (int i=0;i < stackSize;i++){
					
				}
			}
			else if (isTreas){
				if (desc.compareTo("copper") == 0){
					stackSize = 60 - (numPlayers*7);
				}
				else if (desc.compareTo("silver") == 0){
					stackSize = 40;
				}
				else if (desc.compareTo("gold") == 0){
					stackSize = 30;
				}
			}
			else{
				stackSize = 10;
			}
			//Create Stack
			Stack newStack = new Stack();
			cardArry.add(arrayPos,newStack);
			//Create Cards
			for (int i=0;i < stackSize;i++){
				Card newCard = new Card(cost,desc,turns,isAct,isVic,isTreas,isReac);
				
			}
		}
	}
	
	
}

