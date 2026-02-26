import java.util.Scanner;
import java.util.Arrays;
public class linearseach{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int arr []={12,13,14,56,7,8,6,75};
    System.out.println("enter the target number");
     int target=sc.nextInt();
    int ans=linearsearch(arr,target);
   System.out.println("the index of the target element");
        System.out.println(ans);

    }
    static int linearsearch(int arr [],int target){
        for(int i=1;i<arr.length;i++){
            if(target==arr[i]){
                return i;

            }

        }
        return -1;
    }
    
}
