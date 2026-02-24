public class minvalue {
    public static void main(String args []){
        int arr []={13,45,32,13,345};

        int ans=minvalue(arr);
        System.out.println(ans);
    }

    static int minvalue(int arr []){
        int minv=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minv){
                minv= arr[i];
             
            }
        }
        return minv;
    }
}
