import java.util.*;

public class tester {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> data = new ArrayList<Integer>();
		ArrayList<Integer> two = new ArrayList<Integer>();
		String s_length = s.nextLine();
		int length = Integer.parseInt(s_length);
		for (int i=0;i<length;i++)
		{
			String number = s.nextLine();
			int input = Integer.parseInt(number);
			data.add(input);
		}
		for (Integer d:data)
		{
			if (d%2==0)
				two.add(d);
		}
		for (Integer d:two)
		{
			System.out.println(d);
		}
	}
}
