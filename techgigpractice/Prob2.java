package techgigpractice;

import java.util.*;
public class Prob2 {
	/* Read input from STDIN. Print your output to STDOUT*/
 public static void main(String args[] ) throws Exception {

		  Scanner scan = new Scanner(System.in);
	     String s=scan.next();
	     if(isAnInteger(s)){
	        System.out.print("This input is of type Integer.");
	     }else if(isFloat(s)){
	        System.out.print("This input is of type Float.");
	     }else if(isString(s)){
	        System.out.print("This input is of type string.");
	     }else{
	        System.out.print("This is something else.");
	     }
	     
     scan.close();
	   }
	   public static boolean isAnInteger(String s){
	      try{
	      int x = Integer.parseInt(s);
	       return true;  
	      }catch(Exception e){
	         return false;
	      }
	   }
	public static boolean isFloat(String s){
	      try{
	      float x = Float.parseFloat(s);
	       return true;  
	      }catch(Exception e){
	         return false;
	      }
	   }
	   public static boolean isString(String s){
	      if(s instanceof String){
	         return true;
	      }
	         return false;
	      
	   }
	   
}






