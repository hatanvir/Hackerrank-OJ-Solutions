import java.math.BigInteger;
import java.util.Scanner;


public class Java_BigInteger {
	public static void main(String arg[]){
		BigInteger a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextBigInteger();
		b = sc.nextBigInteger();
		
		BigInteger add = a.add(b);
		BigInteger mul = a.multiply(b);
		
		System.out.println(add);
		System.out.println(mul);
	}
}
