public class xoroperator {
    public static void main(String args []){
        int arr[] = {2,3,4,5,2,3,4,5,6};
      System.out.println(xor(arr));
    }
    static int xor(int arr[]){
    int unique=0;
    for (int n : arr  ){
        unique ^=n;

    }
    return unique;
    }
}
