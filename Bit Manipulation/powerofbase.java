public class powerofbase {
    public static void main(String args []){

   int b=2;
    int p =9;
      int ans =1;
      while(p>0){
        if((p&1)==1){
            ans *=b;
        }   
        b *=b;
        p=p>>1;
      }
      System.out.println(ans);
}
}