/*******************************************************************************
*                    Assignment 7 -- Cuckoo Clock Tester                       *
*                                                                              *
* PROGRAMMER:        Joshua Flatt                                              *
* CLASS:             CS160                                                     *
* INSTRUCTOR:        Dean Zeller                                               *
* SEMESTER:          Spring 2021                                               *
* SUBMISSION DATE:   10-29-2021                                                *
*                                                                              *
* DESCRIPTION                                                                  *
* The following program is a tester for the cuckoo clock simulation methods    *
* in the Cuckoo.java class.                                                    *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is copyright (c)2021 Joshua Flatt and Dean Zeller.              *
*                                                                              *
*******************************************************************************/
public class CuckooTester
{
    public static void main(String args[])
    {
        // create new cuckoo instance
        Cuckoo cuckoo = new Cuckoo();
        
        // test first method with several hour values
        cuckoo.cuckoo1(3);
        cuckoo.cuckoo1(6);
        cuckoo.cuckoo1(9);
        cuckoo.cuckoo1(12);
        
        // test second method with several start and end values (start < end)
        cuckoo.cuckoo2(3,5);
        cuckoo.cuckoo2(1,6);
        cuckoo.cuckoo2(8,11);

        // test third method
        cuckoo.cuckoo3(3,5);
        
        // test fourth method
        cuckoo.cuckoo4(3,5);
        
        // test fifth method
        //cuckoo.cuckoo5(11,2);
        
        // test sixth method
        //cuckoo.cuckoo6(11,12);

    }
}