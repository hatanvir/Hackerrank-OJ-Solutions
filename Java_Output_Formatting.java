
package java_output_formatting;

import java.util.Scanner;

public class Java_Output_Formatting {

  
    public static void main(String[] args) {
        String s1[] = new String[3];
        String x[] = new String[3];
        Scanner sc=new Scanner(System.in);
            for(int i=0;i<3;i++)
            {
                s1[i] = sc.next();
                x[i] = sc.next();
            }
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
               System.out.print(s1[i]);
               int space = 15-s1[i].length();
               int zero = 3-x[i].length();
               
               for(int j=0;j<space;j++){
               System.out.print(" ");
               }
               for(int j=0;j<zero;j++){
                   System.out.print("0");
               }
                System.out.println(x[i]);
            }
             System.out.println("================================");
    }
}
