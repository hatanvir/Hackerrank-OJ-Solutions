import java.util.Scanner;


public class Staircase {
	
	static void staircase(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
        		System.out.print(" ");
        	}
            for(int j=0;j<i+1;j++){
        		System.out.print("#");
        	}
        	System.out.print("\n");
        	
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
