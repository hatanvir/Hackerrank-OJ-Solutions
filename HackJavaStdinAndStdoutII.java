
package hack.java.stdin.and.stdout.ii;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class HackJavaStdinAndStdoutII {

   
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    
}
