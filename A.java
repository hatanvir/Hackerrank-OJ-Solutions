import java.util.Scanner;


public class A {
	
	static int CountZero=0,CountPositive=0,CountNegetive=0;
	
    static void plusMinus(int[] arr) {
        for(int i=0;i<arr.length;i++){
        	if(arr[i]>0){
        		CountPositive++;
        	}
        	else if(arr[i]<0){
        		CountNegetive++;
        	}
        	else{
        		CountZero++;
        	}
        }
        float dividedPositive,dividetNegetive,dividetZero;
        
        dividedPositive = (float)CountPositive/(float)arr.length;
        dividetNegetive = (float)CountNegetive/(float)arr.length;
        dividetZero = (float)CountZero/(float)arr.length;
        
        	System.out.format("%.6f\n",dividedPositive);
        	System.out.format("%.6f\n",dividetNegetive);
        	System.out.format("%.6f\n",dividetZero);
        
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }

}
