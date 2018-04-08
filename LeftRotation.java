import java.util.Scanner;


public class LeftRotation {

	    public static void main(String[] args) {
	    	int n,d;
	    	Scanner sc = new Scanner(System.in);
	    	n=sc.nextInt();
	    	d=sc.nextInt();
	    	int []arr = new int[n];
	    	
	    	for(int i=0;i<n;i++){
	    		arr[i] = sc.nextInt();
	    	}
	    	int temp;
	    	
	    	for(int i=0;i<d;i++){
	    	    temp=arr[0];
	    	    int j;
	    		for(j=0;j<n-1;j++){
	    	
	    			arr[j]=arr[j+1];
	    		}
	    		arr[n-1] =temp;
	    	}
	    	for(int i=0;i<n;i++){
	    		System.out.print(arr[i]+" ");
	    	}
	    }

}
