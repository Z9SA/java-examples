import java.util.Scanner; //imports the scanner class for user input

public class a1q2{
	public static void main(String args[]){
		//Scanner object for selected type of conversion
		Scanner tempOpt = new Scanner(System.in);
		//Scanner object for temparature value to convert
		Scanner tempVal = new Scanner(System.in);
		
		/*Selection menu*/
		System.out.println("Hello, what is the unit of temperature you want to convert from:");
		System.out.println("1 - Celsius to Fahrenheit.\n2 - Fahrenheit to Celsius");
		
		/*User selected type of conversion*/
		int option = tempObj.nextline();
		/*User input of temperature*/
		float userTemp = tempVal.nextline();
		/*Initializing temperature scales*/
		float Celsius, Fahrenheit;
		
		
		if(option == 1) {
			Celsius = userTemp;
			Fahrenheit = ((Celsius*9)/5)+32;
			System.out.println("");
		}
}
