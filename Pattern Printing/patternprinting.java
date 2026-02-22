package pattern;

import java.util.Scanner;
public class patternprinting {
   public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     System.out.println("enter the number of row :");
     int rows=sc.nextInt();
     System.out.println("enter the number of columns :");
     int columns=sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
