

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

//The following imports for audio FX:
import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Rooms 
{
	
	private String character_name;
	private Integer luck;
	//private Integer karma;
	private Boolean luckyNumber;
	private Boolean front_door_key;
	//private Boolean bedroom_key;
	private ArrayList<String> inventory;
	
	public void Character_data_retrieval()
	{
		//System.out.println("Importing data from text file...");
        String inputfilename = "Character_data_export.txt";
        String line;
        
        try 
        {
        	File inputfile = new File(inputfilename);
        	Scanner inputreader = new Scanner(inputfile);
        	
        	
        	//read in data
        	this.character_name = inputreader.nextLine();
        	line = inputreader.nextLine();
        	this.luck = Integer.parseInt(line);
        	//line = inputreader.nextLine();
        	//this.karma = Integer.parseInt(line);
        	
        	
        	//close file
        	inputreader.close();
        	//System.out.println("Reading character complete.");
        	//System.out.println("Name: "+this.character_name);
        	//System.out.println("Luck: "+this.luck);
        	//System.out.println("Karma: "+this.karma);
        	
        }
        
        //in case file not found
        catch (FileNotFoundException e)
        {
        	System.out.println("An Error has occured.");
        	e.printStackTrace();
        }
	}
	
	public void introduction()
	{
		System.out.println();
		System.out.println();
		this.delay(2);
		System.out.println("Welcome, "+this.character_name+", to Josh's text adventure game.");
		this.delay(2);
		System.out.println("In this game, your purpose are to do the following:");
		this.delay(2);
		System.out.println("   1. Travel through the building, collecting items.");
		this.delay(2);
		System.out.println("   2. Encounter dillemas, and make choices you feel right.");
		this.delay(2);;
		System.out.println("   3. Collect the key to escape through the front door.");
		this.delay(2);;
		System.out.println("Good Luck!");
		this.delay(1);
		System.out.println("Your Game begins now...");
		this.delay(3);
		front_door_key = false;
		this.inventory = new ArrayList<String>();
	}

	public void foyer()
	{
		System.out.println();
		System.out.println();
		System.out.println("You are in the foyer.");
		this.delay(2);
		System.out.println();
		System.out.println("You notice two ways out of the room:");
		this.delay(2);
		System.out.println("The front door(EXIT) and a hallway.");
		this.delay(2);
		System.out.println("You also have other options: search.");
		this.delay(2);
		System.out.println("Write the number to choose your option.");
		this.delay(2);
		System.out.println(" (1) Try front door");
		System.out.println(" (2) Enter hallway");
		System.out.println(" (3) Search");
		this.delay(1);
		System.out.print("Your decision -> ");
		Scanner reader = new Scanner(System.in);
		String temp = reader.nextLine();
		int choice = Integer.parseInt(temp);
		
		if (choice == 1)
		{
			//this.delay(2);
			System.out.println("You choose the front door.");
			this.delay(2);
			if (this.front_door_key == true)
			{
				this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\key_door_unlock.wav",5500);
				this.delay(3);
				this.end();
			}
			if (this.front_door_key == false)
			{
				this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\locked_door.wav",1700);
				System.out.println("You do not have the key! Resetting room...");
				this.delay(2);
				this.foyer();
			}
			
		}
		if (choice == 2)
		{
			System.out.println("You choose the Hallway.");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\footsteps.wav",2500);
			//this.delay(2);
			this.mainHallway_front();
		}
		if (choice == 3)
		{
			System.out.println("You chose to search.");
		}
		else
		{
			System.out.println("Invalid choice! Resetting room...");
			this.delay(2);
			this.foyer();
		}

	}
	
	public void mainHallway_front()
	{
		System.out.println();
		System.out.println();
		System.out.println("You are in the main hallway.");
		this.delay(2);
		System.out.println();
		System.out.println("You notice multiple ways out of the room:");
		this.delay(2);
		System.out.println("The foyer behind you, the library to the left, kitchen to the right,");
		System.out.println("   and the hallway continues in front of you.");
		this.delay(2);
		System.out.println("You also have other options: search.");
		this.delay(2);
		System.out.println("Write the number to choose your option.");
		this.delay(2);
		System.out.println(" (1) Foyer");
		System.out.println(" (2) Continue forward");
		System.out.println(" (3) Enter Library");
		System.out.println(" (4) Enter Kitchen");
		System.out.println(" (5) Search");
		this.delay(1);
		System.out.print("Your decision -> ");
		Scanner reader = new Scanner(System.in);
		String temp = reader.nextLine();
		int choice = Integer.parseInt(temp);
		
		if (choice == 1)
		{
			System.out.println("You choose the Foyer.");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\footsteps.wav",2500);
			//this.delay(2);
			this.foyer();	
		}
		if (choice == 2)
		{
			System.out.println("You chose to continue down the hallway.");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\footsteps.wav",2500);
			//this.delay(2);
			this.mainHallway_back();
		}
		if (choice == 3)
		{
			System.out.println("You chose the Library.");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
			//this.delay(2);
			this.library();
		}
		if (choice == 4)
		{
			System.out.println("You chose the Kitchen.");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
			//this.delay(2);
			this.kitchen();
		}
		if (choice == 5)
		{
			System.out.println("You chose to search.");
		}
		else
		{
			System.out.println("Invalid choice! Resetting room...");
			this.delay(2);
			this.mainHallway_front();
		}

	}
	
	public void library()
	{
		System.out.println();
		System.out.println();
		System.out.println("You are in the Library.");
		this.delay(2);
		System.out.println();
		System.out.println("You notice a lot of books.");
		this.delay(2);
		System.out.println("Write the number to choose your option.");
		this.delay(2);
		System.out.println(" (1) Return to the hallway");
		System.out.println(" (2) Gain knowledge");
		System.out.println(" (3) Search");
		this.delay(1);
		System.out.print("Your decision -> ");
		Scanner reader = new Scanner(System.in);
		String temp = reader.nextLine();
		int choice = Integer.parseInt(temp);
		
		if (choice == 1)
		{
			System.out.println("You left the room.");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
			//this.delay(2);
			this.mainHallway_front();	
		}
		if (choice == 2)
		{
			System.out.println("You chose to GAIN KNOWLEGE.");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\book.wav",2000);
			this.delay(1);
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\book.wav",2000);
			System.out.println("Your luck increased.");
			this.luck +=4;
			this.delay(1);
			System.out.println("You left the Library.");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
			//this.delay(2);
			this.mainHallway_front();
		}
		if (choice == 3)
		{
			this.luckyNumber = false;
			System.out.println("You chose to search.");
			this.delay(2);
			this.chance();
			if (luckyNumber == true)
			{
				System.out.println("you found something. But forgot to pick it up.");
				this.delay(2);
				System.out.println("You left the room.");
				this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
				this.mainHallway_front();
			}
			else
			{
				System.out.println("You didn't find anything.");
				this.delay(2);
				System.out.println("You left the room.");
				this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
				//this.delay(2);
				this.mainHallway_front();
			}
		}
		else
		{
			System.out.println("Invalid choice! Resetting room...");
			this.delay(2);
			this.library();
		}

	}
	
	public void kitchen()
	{
		System.out.println();
		System.out.println();
		System.out.println("You are in the kitchen.");
		this.delay(2);
		System.out.println();
		System.out.println("You notice some things in the room:");
		this.delay(2);
		System.out.println("A knife, a screwdriver, and a hat.");
		this.delay(2);
		System.out.println("Write the number to choose your option.");
		this.delay(2);
		System.out.println(" (1) Leave Kitchen");
		System.out.println(" (2) Pick up the hat");
		System.out.println(" (3) Pick up the knife");
		System.out.println(" (4) Pick up the screwdriver");
		this.delay(1);
		System.out.print("Your decision -> ");
		Scanner reader = new Scanner(System.in);
		String temp = reader.nextLine();
		int choice = Integer.parseInt(temp);
		
		if (choice == 1)
		{
			System.out.println("You left the kitchen.");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
			//this.delay(2);
			this.mainHallway_front();	
		}
		if (choice == 2)
		{
			System.out.println("You picked up the hat, and then left the room.");
			this.inventory.add("Hat");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
			//this.delay(2);
			this.mainHallway_front();
		}
		if (choice == 3)
		{
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\knife.wav",2500);
			System.out.println("You picked up the knife, and then left the room.");
			this.inventory.add("Knife");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
			//this.delay(2);
			this.mainHallway_front();
		}
		if (choice == 4)
		{
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\knife.wav",2500);
			System.out.println("You picked up the screwdriver, and then left the room.");
			this.inventory.add("Screwdriver");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
			//this.delay(2);
			this.mainHallway_front();
		}
		else
		{
			System.out.println("Invalid choice! Resetting room...");
			this.delay(2);
			this.kitchen();
		}

	}
	
	public void mainHallway_back()
	{
		System.out.println();
		System.out.println();
		System.out.println("You are in the hallway.");
		this.delay(2);
		System.out.println();
		System.out.println("There is a door in front of you leading into the back yard.");
		this.delay(2);
		System.out.println("You notice that the door has a lock on it, but it looks like you could pick it.");
		this.delay(2);
		System.out.println("Write the number to choose your option.");
		this.delay(2);
		System.out.println(" (1) Return back down the hallway");
		System.out.println(" (2) Try the door");
		System.out.println(" (3) Search");
		this.delay(1);
		System.out.print("Your decision -> ");
		Scanner reader = new Scanner(System.in);
		String temp = reader.nextLine();
		int choice = Integer.parseInt(temp);
		
		if (choice == 1)
		{
			System.out.println("You returned back down the hallway.");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
			//this.delay(2);
			this.mainHallway_front();	
		}
		if (choice == 2)
		{
			System.out.println("You tried the door.");
			this.delay(2);
			System.out.println("It's locked...maybe you can use something to pick it...");
			this.delay(2);
			System.out.println("Here's your inventory: "+this.inventory);
			System.out.print("Pick an item to try -> ");
			Scanner r = new Scanner(System.in);
			String tool = reader.nextLine();
			String n = tool.toLowerCase();
			if (n.equals("screwdriver"))
			{
				System.out.println("You successfully picked the lock.");
				this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
				System.out.println("You exited the house into the back yard.");
				//this.delay(2);
				this.backyard();
			}
			else
			{
				this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\locked_door.wav",1700);
				this.delay(2);
				System.out.println("The item you picked, "+tool+", could not pick the lock.");
				this.delay(2);
				System.out.println("You returned back down the hallway in search of a tool...");
				//this.delay(2);
				this.mainHallway_front();
			}
		}
		if (choice == 3)
		{
			System.out.println("You searched the room.");
			this.delay(2);
			System.out.println("You found nothing, then returned back down the hallway.");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\footsteps.wav",2500);
			//this.delay(2);
			this.mainHallway_back();
		}
		else
		{
			System.out.println("Invalid choice! Resetting room...");
			this.delay(2);
			this.mainHallway_back();
		}

	}
	
	public void backyard()
	{
		System.out.println();
		System.out.println();
		System.out.println("You are in the Back Yard.");
		this.delay(2);
		System.out.println();
		System.out.println("You notice that you cannot escape back here because of a high fence.");
		this.delay(2);
		System.out.println("   There is not much to do back here.");
		this.delay(2);
		System.out.println("Write the number to choose your option.");
		this.delay(2);
		System.out.println(" (1) Return inside");
		System.out.println(" (2) Search");
		this.delay(1);
		System.out.print("Your decision -> ");
		Scanner reader = new Scanner(System.in);
		String temp = reader.nextLine();
		int choice = Integer.parseInt(temp);
		
		if (choice == 1)
		{
			System.out.println("You returned back inside.");
			this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
			//this.playSound("Door_open_close.wav",3500);
			//this.delay(2);
			this.mainHallway_back();	
		}
		if (choice == 2)
		{
			System.out.println("You chose to search.");
			this.delay(2);
			System.out.println("...");
			this.delay(2);
			System.out.println("...");
			this.delay(2);
			System.out.println("Is that...a key?");
			System.out.println("Do you take the key?");
			this.delay(2);
			System.out.print("Y/N -> ");
			Scanner r = new Scanner(System.in);
			String tool = reader.nextLine();
			String n = tool.toLowerCase();
			if (n.equals("y"))
			{
				this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\keys.wav",2500);
				System.out.println("You picked up the key.");
				this.delay(2);
				System.out.println("Added to your inventory.");
				this.inventory.add("Key");
				this.front_door_key = true;
				this.delay(2);
				System.out.println("You returned inside. I bet that key goes somewhere.");
				this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
				//this.delay(2);
				this.mainHallway_back();
			}
			if (n.equals("n"))
			{
				System.out.println("You didn't pick up the key.");
				this.delay(2);
				System.out.println("You return inside.");
				this.playSound("C:\\Users\\joshm\\eclipse-workspace\\CS160_Final_Project\\src\\Door_open_close.wav",3500);
				//this.delay(2);
				this.mainHallway_back();
			}
			else
			{
				System.out.println("Invalid choice. Resetting area...");
				this.delay(2);
				this.backyard();
			}
		}
		else
		{
			System.out.println("Invalid choice! Resetting area...");
			this.delay(2);
			this.backyard();
		}

	}
	
	///////Miscellaneous effects/functions /////////////////////
	
	public Boolean chance()
	{
		Random rand = new Random();
		int upperbound = 30-this.luck;
		int c = rand.nextInt(upperbound);
		int x = c - this.luck;
		//System.out.println(x);
		if (x<1)
			luckyNumber = true;
		return luckyNumber;
		
	}
	
	public void delay(int s)
	{
		try 
		{
			TimeUnit.SECONDS.sleep(s);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void end()
	{
		System.out.println("     Congrats!");
		this.delay(2);
		System.out.println("     You found the key to the front door and exited the building.");
		this.delay(2);
		System.out.println("     You escaped.");
		this.delay(2);
		System.out.println("     Game over.");
		System.exit(0);
	}
	
	public static void playSound(String url, int num)
	{
		if (url.isEmpty())
			return;
		try
		{
			Clip clip = AudioSystem.getClip();
			BufferedInputStream x = new BufferedInputStream(new FileInputStream(url));
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(x);
			clip.open(inputStream);
			clip.start();
			Thread.sleep(num);
		}
		catch (Exception e) {e.printStackTrace();}
	}
	
	public void roomCaller()
	{
		this.Character_data_retrieval();
		this.introduction();
		this.foyer();
	}
}