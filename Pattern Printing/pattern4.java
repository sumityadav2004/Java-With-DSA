
//    INVERTED RIGHT ALIGNED TRIANGLE 


import java.util.Scanner;
public class pattern4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number :");
       int n=sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
                for(int j=1; j<=i; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}



//     OUTPUT OF INVERTED RIGHT ALIGNED TRIANGLE 

//        *****
//         ****
//          ***
//           **
//            *
   
