import java.util.Scanner;
public class arrayprinmg{
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
         System.out.println("enter the size of the arr");
        int size=sc.nextInt();
       
        int arr [] =new int [size];
     System.out.println("enter the value of the arr");
      for(int i=0; i<size;i++){
     
        arr[i]=sc.nextInt();

      } 
      System.out.println("the array of the input is");
      for(int i=0;i<size;i++){
        System.out.println(arr[i]+" ");
      }
      arr[0]=arr[0]+arr[1];
      arr[1]=arr[0]-arr[1];
      arr[0]=arr[0]-arr[1];
      for(int i=0;i<size;i++){
        System.out.println(arr[i]);
      }
    } 

}