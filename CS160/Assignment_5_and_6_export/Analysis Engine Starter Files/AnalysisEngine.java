import java.util.Scanner;

public class AnalysisEngine
{
    // define attributes
    private String researcher;
    private String study;
    
    public AnalysisEngine()
    {
        // initialize attributes
        this.researcher = "Blank";
        this.study = "Blank";
        System.out.println("Welcome to the Analysis Engine");
        System.out.println("Programmed by Your Name");  
    }
    
    public void phase0()
    {
        // gather data
        Scanner input = new Scanner(System.in);
        System.out.println("Phase 1 -- Gathering Study Information");
        System.out.print("    Enter researcher name => ");
        this.researcher = input.nextLine();
        System.out.print("    Enter study name => ");
        this.study = input.nextLine();
        input.close();
    }
    
    public void phase1()
    {
        // gathering data
        System.out.println("Phase 1 - Gathering data");
    }
    public void phase2()
    {
        // performing calculations
        System.out.println("Phase 2 - Performing calcualtions");
    }
    
    public void phase3()
    {
        // outputting results
        System.out.println("Phase 3 -- Generating output");
        System.out.println("    Researcher: "+this.researcher);
        System.out.println("    Study: "+this.study);
    }
    
    public void callAllPhases()
    {
        this.phase0();
        this.phase1();
        this.phase2();
        this.phase3();
        
    }
}
    
    

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        