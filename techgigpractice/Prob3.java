package techgigpractice;

import java.util.*;
public class Prob3 {

	 public static void main(String args[] ) throws Exception {

			Scanner scan = new Scanner(System.in);
		   double a = scan.nextDouble();
		   int b = scan.nextInt();
		   int c = scan.nextInt();
		   
//		     long x =Math.round((a*b*c)/100);
		   double x =(a*b*c)/100;
             int i =(int )x;
		    System.out.print(i);
		   scan.close();
		   }
		}

