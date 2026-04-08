public class rotatedarrayrecurance {
    public static void main (String args []){
        int[] arr= {2,4,5,6,7,9,1,3};
        int target=5;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int [] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid =start +(end-start)/2;

        if(target==arr[mid]){
            return mid;
        }
        if(arr[mid]>arr[start]){
            if(target>arr[start]&& target<arr[mid]){
                return search(arr,target,start,mid-1);
            }
            return search(arr,target,mid+1,end);
        }
        if(target>arr[mid]&&target<arr[end]){
            return search(arr,target,mid+1,end);
        }
        return search(arr,target,start,mid-1);
    }
}
