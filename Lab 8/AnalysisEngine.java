import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

//////////////////////////////////////////////////////////////////////////////////
//                Lab 8 - Standard Deviation - AnalysisEngine                   //
//                                                                              //
// PROGRAMMER:        Joshua Flatt   flat7792@bears.unco.edu                    //
// CLASS:             CS160                                                     //
// TERM:              Fall 2021                                                 //
// INSTRUCTOR:        Dean Zeller                                               //
// SUBMISSION DATE:   11/12/2021                                                //
//                                                                              //
// DESCRIPTION                                                                  //
// The program reads in a text file and neatly outputs another file that        //
// prints the name of the study, the researcher name, along with data such as   //
// the sum, average, min, max, variance, and standard deviation.                //
//                                                                              //
// ORIGINAL SOURCE                                                              //
// This code was originally created by Dean Zeller. The code can be found       //
// under the files assigned for Assignment 5 and Lab 8 in Canvas.               //
//                                                                              //
// COPYRIGHT:                                                                   //
// This program is copyright (c)2021 Joshua Flatt and Dean Zeller.              //
//                                                                              //
//////////////////////////////////////////////////////////////////////////////////


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

    public AnalysisEngine()
    {
        // initialize attributes
        this.researcher = "Blank";
        this.study = "Blank";
        this.data = new ArrayList<Double>();
        this.sum = 0.0;
        this.average = 0.0;
        this.max = Double.MIN_VALUE;
        this.min = Double.MAX_VALUE;
        this.variance = 0.0;
        this.stdev = 0.0;
        System.out.println("Welcome to the Analysis Engine");
        System.out.println("Programmed by Josh Flatt");
        System.out.println();
    }
    
    public void callAllPhases()
    {
        this.phase0();
        this.phase1();
        this.phase2();
        this.phase3();
    }
    
    public void phase0()
    {
		// gather data
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter the title of the study => ");
		this.study = scnr.nextLine();
		System.out.println("Name of study set to "+ this.study);
		System.out.println();
		System.out.print("Enter the head of research for this study => ");
		this.researcher = scnr.nextLine();
		System.out.println("Hello, "+ this.researcher+".");
		System.out.println();
		System.out.println("Introduction:");
		System.out.println("This program will calculate the standard deviation for a list");
		System.out.println("of numbers entered by the user. It will run in three phases:");
		System.out.println("    Phase 1 - Gather input from the user");
		System.out.println("    Phase 2 - Calculate sum, average, min, max, variance, stdev");
		System.out.println("    Phase 3 - Output results");
		System.out.println();
		scnr.close();
    }
    
    public void phase1()
    {
        // gathering data
        System.out.println("Phase 1: Gather user input");
        System.out.println("--------------------------");
        System.out.println("Importing data from text file...");
        String inputfilename = "SampleData.txt";
        String line;
        
        try //all file input must happen within try statement
        {
        	File inputfile = new File(inputfilename);
        	Scanner inputreader = new Scanner(inputfile);
        	
        	//size of data read from first line in file
        	line = inputreader.nextLine();
        	int dataLength = Integer.parseInt(line);
        	System.out.println("There will be "+ dataLength +" integers read in from "+ inputfilename);
        	
        	//read in data
        	for (int i = 0; i < dataLength; i++)
        	{
        		line = inputreader.nextLine();
        		double num = Double.parseDouble(line);
        		data.add(num);
        	}
        	
        	//close file
        	inputreader.close();
        	System.out.println("Reading data complete.");
        	System.out.println("Data: "+ data);
        }
        //in case file not found
        catch (FileNotFoundException e)
        {
        	System.out.println("An Error has occured.");
        	e.printStackTrace();
        }
        System.out.println();
        System.out.println();
    }
    
    public void phase2()
    {
        // performing calculations
        System.out.println("Phase 2: Perform calculations");
        System.out.println("-----------------------------");
        
        //calculating sum
        this.sum = calculateSum();
        System.out.println("    Calculated sum ("+ this.sum +")");
        
        //calculating average
        this.sum = calculateAverage();
        System.out.println("    Calculated average ("+ this.average +")");
        
        //calculating minimum & maximum
        this.min = calculateMin();
        this.max = calculateMax();
        System.out.println("    Calculated min ("+ this.min +")");
        System.out.println("    Calculated max ("+ this.max +")");
        
        //calculating variance
        this.variance = calculateVariance();
        System.out.println("    Calculated variance ("+ this.variance +")");
        
        //calculating standard deviation
        this.stdev = calculateStdev();
        System.out.println("    Calculated standard deviation ("+ this.stdev +")");
        
        System.out.println("Phase 2 complete");
        System.out.println();
    }
    
    public void phase3()
    {
        // exporting results
        System.out.println("Phase 3: Export table");
        System.out.println("---------------------");
        String outputFile = "export.txt";
        try
        {
        	FileWriter outputWriter = new FileWriter(outputFile);
        	//single string argument and new lines specified
        	outputWriter.write("Writing to file "+ outputFile +"\n");
        	outputWriter.write(this.study +"\n");
        	outputWriter.write("by "+ this.researcher +"\n");
        	outputWriter.write("Number of elements in dataset: "+ data.size() +"\n");
        	outputWriter.write("Sum: "+ this.sum +"\n");
        	outputWriter.write("Average: "+ this.average +"\n");
        	outputWriter.write("Min: "+ this.min +"\n");
        	outputWriter.write("Max: "+ this.max +"\n");
        	outputWriter.write("Variance: "+ this.variance +"\n");
        	outputWriter.write("Standard Deviation: "+ this.stdev +"\n");
        	outputWriter.close();
        }
        catch (IOException e)
        {
        	System.out.println("An error has occured.");
        	e.printStackTrace();
        }
        this.printTable();
        System.out.println("Phase 3 complete");
        System.out.println("Exiting program");
    }
    
    public Double calculateSum()
    {
    	/*********************************************
    	 * Method:  calculateSum                     *
    	 * Purpose: This method takes the sum of all *
    	 * 		numbers in the ArrayList "data".     *
    	 * Parameters:                               *
    	 * 		ArrayList<Double> data               *
    	 * Return Value: Double                      *
    	 *********************************************/
    	double sum = 0.0;
        for (Double d : this.data)
        {
        	sum += d;
        }
        return sum;
    }
    
    public Double calculateAverage()
    {
		/*********************************************
		 * Method:  calculateAverage                 *
		 * Purpose: This method takes the average of *
		 * 		all numbers in the ArrayList "data". *
		 * Parameters:                               *
		 * 		None                                 *
		 * Return Value: none                        *
		 *********************************************/
	    return this.sum / data.size();
    }
    
    public Double calculateMin()
    {
		/*******************************************
		 * Method:  calculateMin                   *
		 * Purpose: It finds the smallest number   *
		 * 		in the ArrayList "data".           *
		 * Parameters:                             *
		 * 		None                               *
		 * Return Value: none                      *
		 *******************************************/
		Double minimum = Double.MAX_VALUE;
	    for (Double d : this.data)
		{
	        if (d < minimum)
	            minimum = d;
		}
	    return minimum;	
    }
    
    public Double calculateMax()
    {
    	/*******************************************
    	 * Method:  calculateMax                   *
    	 * Purpose: It finds the largest number    *
    	 * 		in the ArrayList "data".           *
    	 * Parameters:                             *
    	 * 		None                               *
    	 * Return Value: none                      *
    	 *******************************************/
    	Double maximum = Double.MIN_VALUE;
        for (Double d : this.data)
		{
			if (d > maximum)
				maximum = d;
		}
        return maximum;
    }
    
    public Double calculateVariance()
    {
    	/**********************************************
    	 * Method:  calculateVariance                 *
    	 * Purpose: finds the Variance of the numbers *
    	 * 		included in the ArrayList "data".     *
    	 * Parameters:                                *
    	 * 		None                                  *
    	 * Return Value: none                         *
    	 **********************************************/
        // summation((x - average) ^ 2/(n - 1)) [numerator and denominator marked for ease]
        Double numerator = 0.0;
        for (Double d : this.data)
        	numerator += (d - this.average) * (d - this.average); //squared
        Double denominator = (double)(this.data.size() - 1);
        Double variance = numerator / denominator;
        return variance;
    }
    
    public Double calculateStdev()
    {
    	/**************************************************
    	 * Method:  calculateStdev                        *
    	 * Purpose: finds the standard deviation of the   *
    	 * 		numbers included in the ArrayList "data". *
    	 * Parameters:                                    *
    	 * 		None                                      *
    	 * Return Value: none                             *
    	 **************************************************/
        return Math.sqrt(this.variance);
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
        System.out.format ("| %-36s | %n", this.study);
        System.out.format ("| by %-33s | %n", this.researcher);
        System.out.println("+--------------------------------------+");
        System.out.format ("| Size of dataset (n):     %10d  | %n", this.data.size());
        System.out.format ("| Sum:                     %10.3f  | %n", this.sum);
        System.out.format ("| Average:                 %10.3f  | %n", this.average);
        System.out.format ("| Min:                     %10.3f  | %n", this.min);
        System.out.format ("| Max:                     %10.3f  | %n", this.max);
        System.out.format ("| Variance:                %10.3f  | %n", this.variance);
        System.out.format ("| Standard Deviation:      %10.3f  | %n", this.stdev);
        System.out.println("+--------------------------------------+");
        System.out.println();
    }
}
    
    

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        