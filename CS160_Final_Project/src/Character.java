import java.util.*;
import java.io.FileWriter;
import java.io.IOException;


public class Character {
	
	public String name;
	public Integer luck;
	
	public Character(Scanner scnr) {
		this.setName(scnr);
		this.setRandomLuck();
		this.exportCharacterData();
	}
	
	public void setName(Scanner scnr) {
		System.out.print("Enter your character name -> ");
		this.name = scnr.nextLine();
		System.out.println("Hello, "+ this.name +".");
	}
	
	public void setRandomLuck() {
		Random rand = new Random();
		//generates value from 0-20
		luck = rand.nextInt(20);
		if (luck > 10) { System.out.println("You are feeling lucky today."); }
		if (luck == 10) { System.out.println("You have average luck."); }
		if (luck < 10) { System.out.println("You are feeling unlucky today."); }
	}
	
	public void exportCharacterData() {
		String outputFile = "Character_data_export.txt";
		try {
			FileWriter outputWriter = new FileWriter(outputFile);
			outputWriter.write(this.name +"\n");   //Character name line 1
			outputWriter.write(this.luck +"\n");   //Luck line 2 
//			outputwriter.write(this.karma+"\n");   //Karma line 3	
			outputWriter.close();	
		} 
		catch (IOException e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}
	}
}
