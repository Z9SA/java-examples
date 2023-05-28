/*
This program calculates and outputs the multiplication table of numbers 1 through 12, multiplied by 1 through 12
*/
public class a1q1{
	
	public static void main(String args[]){
		
		/*inserts the empty cell in 
		the first row*/
		System.out.printf("     |");
		
		/*first loop creates the title row of 
		the number to be multiplied*/
		for(int title = 1; title < 13; ++title){ 
			
			/*conversion to string to measure the spaces needed before 
			each title row number for proper formatting*/
			int titleLength = String.valueOf(title).length(); 
			
			/*checks for single digits for proper spacing*/
			if(titleLength == 1){ 
				System.out.printf("   %d |", title);
			}
			/*checks for double digits for proper spacing*/
			if(titleLength == 2){ 
				System.out.printf("  %d |", title);
			}
			/*shift output to new row after 12th digit*/
			if(title == 12){ 
				System.out.print("\n");
			}
		}
		
		/*increment the number to be multiplied*/
		for(int number = 1; number < 13; ++number){ 
			int numLength = String.valueOf(number).length(); 
			
			/*conversion to string to measure the spaces needed before 
			each number for proper formatting*/
			if(numLength == 1){
				System.out.printf("   %d |", number); 
				/*checks for single digits for proper spacing*/
			}
			if(numLength == 2){
				System.out.printf("  %d |", number); 
				/*checks for double digits for proper spacing*/
			}
			for(int multi = 1; multi < 13; ++multi){
			
			
				int product = number * multi; //Multiplication process between the base number and it's multiplier
			
				int length = String.valueOf(product).length();
			
				if(length == 1){
					System.out.printf("   %d |", product);
				}
				if(length == 2){
					System.out.printf("  %d |", product);
				}
				if(length == 3){
					System.out.printf(" %d |", product);
				}
				if(multi == 12){
					System.out.print("\n");
				}
			}
		}
	}
}
