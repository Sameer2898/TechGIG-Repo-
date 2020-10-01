package techgigpractice;

import java.util.Scanner;

public class Prob8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,num=0,nu;
		Scanner scan = new Scanner(System.in);
		n= scan.nextInt();
		nu=n;
		while(nu!=0) {
			int rem = nu%10;
			num=num+rem*rem*rem;
			nu=nu/10;
		}
		if(num==n) {
			System.out.println("Armstrong");
		}else {
			System.out.println(" not Armstrong");
		}
	
	scan.close();
	
	}

}
//alternative
/*
int result = 0;

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();

		int input = number;

		do {

			result += Math.pow(input % 10, 3);

			input /= 10;

		} while (input > 0);



		if (number == result)

			System.out.println("True");

		else

			System.out.println("False");
*/

