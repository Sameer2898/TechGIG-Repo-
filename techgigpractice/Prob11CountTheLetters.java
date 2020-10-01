package techgigpractice;

import java.util.Scanner;

public class Prob11CountTheLetters {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    String tech = scan.nextLine();     //I Am Awesome

		   	   	int uppercase =0;
				int lowercase=0;
//				boolean check = false;
			
//				System.out.println(tech.length());
				for(int j = 0;j<tech.length();j++) {
				        if( tech.charAt(j) >= 'A' && tech.charAt(j) <= 'Z') {	
			        			 uppercase++;
			        		}else if(tech.charAt(j) >= 'a' && tech.charAt(j) <= 'z') {
			        			lowercase++;
			        		}
			        		}
		        System.out.print( uppercase + "\n" + lowercase);
		        scan.close();
	}

}
