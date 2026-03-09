import java.util.Scanner;
public class Armstrong{
    public static void main (String args[]){
  int r; 
  int sum=0; 
  int temp;
  Scanner sc =new Scanner(System.in);
  int n=sc.nextInt();

    temp=n;
    while(n>0){
        r = n%10;
        sum = sum+(r*r*r);
        n = n/10;
    }
    if(temp==sum){
        System.out.println("this is a Armstrong");

    }
    else{
        System.out.println("this is not a Armstrong");
    }
    }
}
    
