
//////////////////////////////////////////////////////////////////////////////////
//                Assignment 5 & 6 - Standard Deviation - AnalysisEngine        //
//                                                                              //
// PROGRAMMER:        Joshua Flatt   flat7792@bears.unco.edu                    //
// CLASS:             CS160                                                     //
// TERM:              Fall 2021                                                 //
// INSTRUCTOR:        Dean Zeller                                               //
// SUBMISSION DATE:   10/15/2021                                                //
//                                                                              //
// DESCRIPTION                                                                  //
// The program is a quiz that engages the user through characterization         //
// of the test. The score is also kept track of and shown to the user at the    //
// end of the game.                                                             //
//                                                                              //
// ORIGINAL SOURCE                                                              //
// This code was originally created by Dean Zeller. The code can be found       //
// under the files assigned for Assignment 5 in Canvas.                         //
//                                                                              //
// COPYRIGHT:                                                                   //
// This program is copyright (c)2021 Joshua Flatt and Dean Zeller.              //
//                                                                              //
//////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.util.Scanner;

public class AnalysisEngine
{
    // define attributes
    private String researcher;
    private String study;
    private ArrayList<Double> data;
    private Double sum;
    private Double average;
    private Double max;
    private Double min;
    private Double variance;
    private Double stdev;
    private int length;

    
    public AnalysisEngine()
    {
        // initialize attributes
        this.researcher = "Blank";
        this.study = "Blank";
        this.data = new ArrayList<Double>();
        System.out.println("Welcome to the Analysis Engine");
        System.out.println("Programmed by Josh Flatt");
        System.out.println();
    }
    
    public void phase0()
    {
        // gather data
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the title of the study => ");
        this.study = input.nextLine();
        System.out.println("Name of study set to "+this.study);
        System.out.println();
        System.out.print("Enter the head of research for this study => ");
        this.researcher = input.nextLine();
        System.out.println("Hello, "+this.researcher+".");
        System.out.println();
        System.out.println("Introduction:");
        System.out.println("This program will calculate the standard deviation for a list");
        System.out.println("of numbers entered by the user. It will run in three phases:");
        System.out.println("    Phase 1 - Gather input from the user");
        System.out.println("    Phase 2 - Calculate sum, average, min, max, variance, stdev");
        System.out.println("    Phase 3 - Output results");
        System.out.println();
       
    }
    
    public void calcSum()
    {
    	/*********************************************
    	 * Method:  calcSum                          *
    	 * Purpose: This method takes the sum of all *
    	 * 		numbers in the ArrayList "data".     *
    	 * Parameters:                               *
    	 * 		None                                 *
    	 * Return Value: none                        *
    	 *********************************************/
    	this.sum = 0.0;
        for (Double d:this.data)
        	this.sum += d;
        System.out.println("    Calculated sum ("+this.sum+")");	
    }
    
    public void calcAverage()
    {
    	/*********************************************
    	 * Method:  calcAverage                      *
    	 * Purpose: This method takes the average of *
    	 * 		all numbers in the ArrayList "data". *
    	 * Parameters:                               *
    	 * 		None                                 *
    	 * Return Value: none                        *
    	 *********************************************/
    	this.average = 0.0;
        this.average = this.sum / this.data.size();
        System.out.println("    Calculated average ("+this.average+")");
    }
    
    public void calcMin()
    {
    	/*******************************************
    	 * Method:  calcMin                        *
    	 * Purpose: It finds the smallest number   *
    	 * 		in the ArrayList "data".           *
    	 * Parameters:                             *
    	 * 		None                               *
    	 * Return Value: none                      *
    	 *******************************************/
        this.min = 9999999.0;
        for (Double d:this.data)
		{
            if (d<this.min)
                this.min = d;
		}
        System.out.println("    Calculated min ("+this.min+")");	
    }
    
    public void calcMax()
    {
    	/*******************************************
    	 * Method:  calcMax                        *
    	 * Purpose: It finds the largest number    *
    	 * 		in the ArrayList "data".           *
    	 * Parameters:                             *
    	 * 		None                               *
    	 * Return Value: none                      *
    	 *******************************************/
    	this.max = 0.0;
        for (Double d:this.data)
		{
			if (d>this.max)
				this.max = d;
		}

        System.out.println("    Calculated max ("+this.max+")");
    }
    
    public void calcVariance()
    {
    	/**********************************************
    	 * Method:  calcVariance                      *
    	 * Purpose: finds the Variance of the numbers *
    	 * 		included in the ArrayList "data".     *
    	 * Parameters:                                *
    	 * 		None                                  *
    	 * Return Value: none                         *
    	 **********************************************/
    	this.variance = 0.0;
        // summation((x-avg)^2/(n-1)) [top and bottom marked for ease]
        Double top = 0.0;
        for (Double d : this.data)
        	top += (d - this.average)*(d-this.average); //squared
        Double bottom = (double)(this.data.size()-1);
        this.variance = top / bottom;
        System.out.println("    Calculated variance ("+this.variance+")");
    }
    
    public void calcStdev()
    {
    	/**************************************************
    	 * Method:  calcStdev                             *
    	 * Purpose: finds the standard deviation of the   *
    	 * 		numbers included in the ArrayList "data". *
    	 * Parameters:                                    *
    	 * 		None                                      *
    	 * Return Value: none                             *
    	 **************************************************/
    	this.stdev = 0.0;
        this.stdev = Math.sqrt(this.variance);
        System.out.println("    Calculated standard deviation ("+this.stdev+")");
    }
    
    public void printTable()
    {
    	/*********************************************
    	 * Method:  printTable                       *
    	 * Purpose: prints all the values calculated *
    	 * 		through the program's methods.       * 
    	 * Parameters:                               *
    	 * 		None                                 *
    	 * Return Value: none                        *
    	 *********************************************/
        System.out.println();
        System.out.println("+--------------------------------------+");
        System.out.format ("| %-36s | %n",this.study);
        System.out.format ("| by %-33s | %n",this.researcher);
        System.out.println("+--------------------------------------+");
        System.out.format ("| Size of dataset (n):     %10d  | %n",this.length);
        System.out.format ("| Sum:                     %10.3f  | %n",this.sum);
        System.out.format ("| Average:                 %10.3f  | %n",this.average);
        System.out.format ("| Min:                     %10.3f  | %n",this.min);
        System.out.format ("| Max:                     %10.3f  | %n",this.max);
        System.out.format ("| Variance:                %10.3f  | %n",this.variance);
        System.out.format ("| Standard Deviation:      %10.3f  | %n",this.stdev);
        System.out.println("+--------------------------------------+");
        System.out.println();
    }
    
    public void phase1()
    {
        // gathering data
        System.out.println("Phase 1: Gather user input");
        System.out.println("--------------------------");
        System.out.println("To enter the data correctly, the program needs to know how many");
        System.out.println("numbers are in the dataset.");
        Scanner r = new Scanner(System.in);
        System.out.print("    Size of dataset => "); //4 spaces
        String input = r.nextLine();
        this.length = Integer.parseInt(input);
        System.out.println("    Data will have "+this.length+" elements, indexed 0 through "+(this.length-1)+".");
        System.out.println();
        System.out.println("Enter integer or floating-point values:");
        for (int i=0; i<this.length; i++)
        {
        	System.out.print("    Index "+i+" => ");
            String addr = r.nextLine();
            double numaddr = Double.parseDouble(addr);
            data.add(numaddr);
        }
        System.out.print("Data Entered: ");
        for (Double d:this.data)
            System.out.print(d+", ");
        System.out.println();
        System.out.println();
    }
    
    public void phase2()
    {
        // performing calculations
        System.out.println("Phase 2: Perform calculations");
        System.out.println("-----------------------------");
        
        //calculating sum
        this.calcSum();
        
        //calculating average
        this.calcAverage();
        
        //calculating minimum & maximum
        this.calcMin();
        this.calcMax();
        
        //calculating variance
        this.calcVariance();
        
        //calculating standard deviation
        this.calcStdev();
        
        System.out.println("Phase 2 complete");
        System.out.println();
    }
    
    public void phase3()
    {
        // outputting results
        System.out.println("Phase 3: Output table");
        System.out.println("---------------------");
        this.printTable();
        System.out.println("Phase 3 complete");
        System.out.println("Exiting program");
    }
    
    public void callAllPhases()
    {
        this.phase0();
        this.phase1();
        this.phase2();
        this.phase3();
        
    }
}
    
    

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        