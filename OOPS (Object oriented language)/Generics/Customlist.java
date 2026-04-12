package generis;

public class Customlist {
    
private int[] data;
private static int defaultsize=10;
private int size=0;

public Customlist(){
    this.data=new int[defaultsize];
}
public void add(int num){
    if (isfull()){
        resize(); 
    }   
    data[size++]=num;
}
private void resize(){
    int[] temp=new int[data.length*2];
    for(int i=0;i<data.length;i++){                     
       temp[i]=data[i];
    }
    
    data=temp;
}
private boolean isfull(){
    return size ==data.length;
}
public int remove(){
    int remove =data[--size];
   return remove;
}
public int get(int index){
    return data[index];

}
public int size (){
    return size;
}
public void set(int index,int value){
    data[index]=value;
}
@override
public String toString(){
    return "customlist{"+"data=" +Arrays.toString(data)+
           ",size=" +size +'}';

    }
}


