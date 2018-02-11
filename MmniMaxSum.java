import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


public class MmniMaxSum {
	static  long sum_1,sum_2;
	
	 static long[] arr_2 = new long[5];
	 static void miniMaxSum(int[] arr) {
	       for(int i=0;i<arr.length;i++){
	    	   sum_1+=arr[i];
	       }
	       for(int j=0;j<arr.length;j++){
	    	   arr_2[j]= (sum_1-arr[j]);
	       }
	      System.out.println(getMinValue(arr_2)+" "+getMaxValue(arr_2));
	    }

	    private static long getMinValue(long[] arr_22) {
	    	Arrays.sort(arr_22);
	    	long min = arr_22[0];
	    	for(int i=1;i<arr_22.length;i++){
	    		if(min>arr_22[i]){
	    			min=arr_22[i];
	    		}
	    	}
	    	return min;
	}

		private static long getMaxValue(long[] arr_22) {
	    	Arrays.sort(arr_22);
	    	long max = arr_22[0];
	    	for(int i=1;i<arr_22.length;i++){
	    		if(max<arr_22[i]){
	    			max=arr_22[i];
	    		}
	    	}
	    	return max;
		}

		public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int[] arr = new int[5];
	        for(int arr_i = 0; arr_i < 5; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        miniMaxSum(arr);
	        in.close();
	    }

}
