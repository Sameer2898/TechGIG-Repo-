package techgigpractice;
import java.util.*;
public class Prob10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] arr = new int[n];
		for(int r =0;r<arr.length;r++){
		   arr[r]=scan.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.print(arr[arr.length-2]);
		scan.close();
	}

}
