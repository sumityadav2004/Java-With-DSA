import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Attributes;

public class charlinear{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
      System.out.println("enter the targeet that would you to find ");
            String arr="sumit";  
      char target='a';
         boolean ans = charlinear(arr, target);
         System.out.println(ans);
    }
    static boolean charlinear(String arr,char target){
    for(int i=0;i<arr.length();i++){
        if(arr.charAt(i)==target){
           return true;
        }
    }
    return false;
}
}