import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class SockMerchant {
	
	static int count = 0;
	
	 static void sockMerchant(int n, int[] ar) {
		 Arrays.sort(ar);
		 for(int i=1;i<ar.length;i++){
			 if(ar[i-1]==ar[i]){
				 count++;
				 i=i+1;
			 }
		 }
		 System.out.println(count);
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	       sockMerchant(n, ar);
	    }
}
