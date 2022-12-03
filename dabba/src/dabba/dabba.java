package dabba;
import java.util.*;

public class dabba {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String classes_s = s.nextLine();
        int classes = Integer.parseInt(classes_s);
        double gpa = 0;
        for (int i=0;i<classes;i++)
        {
            String gpa_s = s.nextLine();
            double gpa_i = Double.parseDouble(gpa_s);
            gpa = gpa + gpa_i;
        }
        System.out.println(gpa/classes);
	}

}
