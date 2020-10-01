package techgigpractice;

public class Prob6 {

	public static void main(String[] args) {
//	Scanner scan = new Scanner(System.in);
      int x =    34567;
      int count = 0;
     
      while(x>0) {
    	  x=x/10;
    	  count++;
      }
      
      System.out.print(count);
	}

}
