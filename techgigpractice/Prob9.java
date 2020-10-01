package techgigpractice;

import java.util.Scanner;

public class Prob9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 0;

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
        int input = number;

		do {
      input /= 10;
      length++;
    } while (input > 0);

input = number;
int result = 0;
    
do {
     result += Math.pow(input % 10, length);
      input /= 10;
    } while (input > 0);

   if (number == result)
       System.out.println("True");
else
     System.out.println("False");

 scan.close();
	}

}
//alternative
//int count=0;
//Scanner scan = new Scanner(System.in);
//
//int n= scan.nextInt();
//scan.close();
//int nu=n;
//
//
//
//while (nu > 0) {
//    nu /= 10;     // nu = nu/10
//    count++;
//}
//System.out.println(count);
//
//nu=n;
//
//int num=0;
//
//while(nu>0) {
//	int rem = nu%10;
//	num += Math.pow(rem, count);
//	nu=nu/10;
//}
//System.out.println(num);
//System.out.println(n);
//if(n==num) 
//	System.out.println("True");
//else 
//	System.out.println("False");
//
