package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PlayGame {
	public static void main(String[] args){
		/*** Create store ***/
		//Validate number of players
		int numPlayers = Integer.valueOf(args[1]); //convert from string to int
		if (numPlayers < 2 || numPlayers > 4){
			System.out.println("Invalid number of players.");
		}
		
		
		//Validate file
		File file = new File(args[0]); //first parameter of args is a file location
		
		if (!file.exists() || !file.canRead()) {
            System.out.println("unable to load "+file.getName());
            return;
        }
		
		try {
            Scanner inFile = new Scanner(file);
            while (inFile.hasNext()) {
            	Store gameStore = new Store(inFile,numPlayers);
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("unable to load"+file.getName());
        }
		

	//Load Store-- fixed-size array of node objects
	//Prompt for number of players
	//Create decks-- double-sided linked lists of cards
	//Create discard piles-- double-sided linked lists of cards
	//Create hands-- linked list of cards
	/*****Start "Victory" while loop-- while provinces exist and there are not 3 empty supplies*****/
	//display 1st player hand and prompt for input
	//continue prompting players
	}
}

