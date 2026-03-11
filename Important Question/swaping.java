import java.util.Scanner;
public class swaping {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int temp;
        int a=sc.nextInt();
        System.out.println("enter the number a:");
        int b=sc.nextInt();
        System.out.println("enter the number b:");
         
        temp=a;
        a=b;
        b=temp;

        System.out.println(a);
        System.out.println(b);
        
    }
}
