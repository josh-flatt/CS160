

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Character 
{
	public String character_name;
	public Integer luck;
	//public Integer karma;
	
	public void nameNamer()
	{
		Scanner name_in = new Scanner(System.in);
		System.out.print("Enter your character name -> ");
		this.character_name = name_in.nextLine();
		System.out.println("Hello, "+this.character_name+".");
	}
	
	public void randomLuck()
	{
		Random rand = new Random();
		int upperbound = 20;
		//generates value from 0-20
		luck = rand.nextInt(upperbound);
		if (luck>10)
		{
			if (luck>15)
				System.out.println("You are extremely lucky.");
			else
				System.out.println("You are somewhat lucky.");
		}
		
		if (luck==10)
			System.out.println("You have no luck.");
		
		if (luck<10)
		{
			if (luck<5)
				System.out.println("You are extemely unlucky.");
			else
				System.out.println("You are somewhat unlucky.");
		}
		
	}
	
	/*public void karmaCount()
	{
		this.karma = 0;
	}*/
	
	public void character_export()
	{
		 String outputfilename = "Character_data_export.txt";
	     try
	     {
	        FileWriter outputwriter = new FileWriter(outputfilename);
	        outputwriter.write(this.character_name+"\n");   //Character name line 1
	        outputwriter.write(this.luck+"\n");             //Luck line 2 
	        //outputwriter.write(this.karma+"\n");            //Karma line 3	
	        outputwriter.close();	
	     }
	        
	     catch (IOException e)
	     {
	        System.out.println("An error has occured.");
	        e.printStackTrace();
	     }
	        
	}
	
	
	
	
	public void callAll()
	{
		this.nameNamer();
		this.randomLuck();
		//this.karmaCount();
		this.character_export();
	}
}
