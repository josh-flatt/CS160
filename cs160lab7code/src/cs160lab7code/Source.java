package cs160lab7code;

import java.util.*;

public class Source
{
	public static void main(String args[])
	{
		//Initialize Variables
		Scanner scnr = new Scanner(System.in);
		String input;
		int startHour;
		int endHour;
		
		//Clock part 1...input
		input = scnr.nextLine();
		startHour = Integer.parseInt(input);
		System.out.print("It's "+ startHour +" o'clock!");
		for (int i = 0; i < startHour; i++)
			System.out.print(" Cuckoo!");

		
		//Clock part 2...start and end hours
        input = scnr.nextLine();
        startHour = Integer.parseInt(input);
        input = scnr.nextLine();
        endHour = Integer.parseInt(input);
        for (int j = startHour; j <= endHour; j++)
        {
            System.out.print("It's "+ j +" o'clock! ");
            for (int i = 0; i < j; i++)
            {
                System.out.print("Cuckoo! ");
            }
            System.out.println();
        }
        

		//Clock part 3...Start and end hours, including a wrap-around after 12.
        input = scnr.nextLine();
        startHour = Integer.parseInt(input);
        input = scnr.nextLine();
        endHour = Integer.parseInt(input);
        if (startHour > endHour) //Wrap around past 12:00
        {
        	for (int hr = startHour; hr <= 12; hr++)
        	{
        		System.out.print("It's "+ hr +" o'clock! ");
        		for (int i = 0; i < hr; i++)
        		{
        			System.out.print("Cuckoo! ");
        		}
        		System.out.println();
        	}
        	for (int hr = 1; hr <= endHour; hr++)
        	{
        		System.out.print("It's "+ hr +" o'clock! ");
        		for (int i = 0; i < hr; i++)
        		{
        			System.out.print("Cuckoo! ");
        		}
        		System.out.println();
        	}
        }
        if (startHour < endHour) //No wrap
        {
        	for (int j = startHour; j <= endHour; j++)
        	{
        		System.out.print("It's "+ j +" o'clock! ");
        		for (int i = 0; i < j; i++)
        		{
        			System.out.print("Cuckoo! ");
        		}
        		System.out.println();
        	}
        }
        scnr.close();
	}
}
