
//////////////////////////////////////////////////////////////////////////////////
//         Assignment 5 & 6 - Standard Deviation - AnalysisEngineTester         //
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