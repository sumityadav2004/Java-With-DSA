import java.util.Scanner;
public class swaping {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int temp;
        System.out.println("enter the number a:");
        int a=sc.nextInt();
        System.out.println("enter the number b:");
        int b=sc.nextInt();
       
         
        temp=a;
        a=b;
        b=temp;
        System.out.println("Swapping value is");
        System.out.println(a);
        System.out.println(b);
 
    }
}
