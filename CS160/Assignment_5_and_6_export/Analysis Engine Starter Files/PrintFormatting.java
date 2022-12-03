public class PrintFormatting
{
    public static void main(String args[])
    {
        String name = "Robert";
        int age = 74;
        double salary = 64132.00;
        double pi = 3.1415926535;
        
        System.out.println("+---------------------+");
        System.out.format ("| Name:    %10s | %n",name);
        System.out.format ("| Age:     %10d | %n",age);
        System.out.format ("| Salary:  %10.2f | %n",salary);
        System.out.format ("| Pi:      %10.7f | %n",pi);
        System.out.println("+---------------------+");
   
    }
}