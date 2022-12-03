
//////////////////////////////////////////////////////////////////////////////////
//                Lab 8 - Standard Deviation - AnalysisEngineTester             //
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



public class AnalysisEngineTester
{
    public static void main(String args[])
    {
        // instantiate study
        AnalysisEngine study1 = new AnalysisEngine();
        
        // call study phases in order
        study1.callAllPhases();
    
    }
}