package techgigpractice;
import java.util.Scanner;
public class Prob7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first= scan.nextInt();
	   int second = scan.nextInt();
	   int count= 0;
	   first = first<=2 ? 2:first;
	   for(int i=first;i<=second;i++){
	      if(isPrime(i)){
	         count++;
	      }
	   }
	   System.out.print(count);
	   scan.close();
	   }
	   public static boolean isPrime(int number){
		   for(int i=2; i<number; i++){
	            if(number%i == 0){
	                return false; //number is divisible so its not prime
	            }
	        }
	        return true; //number is prime now
	   
	
	   }

}



/*Alternative 

Scanner scan = new Scanner(System.in);

int first = scan.nextInt();

scan.nextLine();

int second = scan.nextInt();

first = first <= 2 ? 2 : first;

int count = 0;

for (int i = first; i <= second; i++) {

	if (isPrime(i)) {

		count++;

	}

}

System.out.println(count);

}



public static boolean isPrime(int number) {

int sqrtVal = (int) Math.sqrt(number);

for (int i = 2; i <= sqrtVal; i++) {

	if (number % i == 0) {

		return false;

	}

}

return true;

*/

