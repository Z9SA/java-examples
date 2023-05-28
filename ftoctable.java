public class fctotable
{
    public static void main(String[] args) 
    {
      //  System.out.println("Fahrenheit to Celsius Conversion Table");
     //   System.out.println("-------------------------------------");
     double total, begining = 200,smart = 1.005;  
     for (int i = 0; i <= 12; i += 1) {
            double interest = 1.004;
            total = interest * begining;
            total = smart * total;
            System.out.printf("%0.2f %0.2f", i, total);
            
        
        }
    }
}