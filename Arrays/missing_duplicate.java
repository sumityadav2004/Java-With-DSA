import java.util.ArrayList;
public class missing_duplicate {
    public static void main(String args[]){
        int num[]={4,2,3,4,6,5,3};
        ArrayList<Integer> ans=missingnumber(num);
          System.out.println(ans);
                                        
    }
     public static ArrayList<Integer> missingnumber(int num[]){
        int i=0;
        while(i<num.length){
         int correct=num[i]-1;
         if(num[i]!=num[correct]){
            swap(num,i,correct);
         }else{
            i++;
         }
        }
        
       ArrayList<Integer> ans= new ArrayList<>();

        for(int index=0;index<num.length;index++){
            if(num[index]!=index+1){
                ans.add(index + 1);

            }
        }
        return ans;
    }
    static void swap(int num [],int first,int second ){
        int temp=num[first];
        num[first]=num[second];
        num[second]=temp;

    }
}
