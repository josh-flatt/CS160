package dabba;
import java.util.*;

public class GPACalculator {
	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
        int classes = Integer.parseInt(input);
        double gpa = 0;
        for (int i = 0; i < classes; i++)
        {
            input = scnr.nextLine();
            double gpaToAdd = Double.parseDouble(input);
            gpa += gpaToAdd;
        }
        scnr.close();
        System.out.println(gpa / classes);
	}
}
