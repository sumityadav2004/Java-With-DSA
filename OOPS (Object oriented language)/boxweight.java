
import javax.print.attribute.standard.MediaSize;


    public class boxweight extends classbox{
        double weight;
    
  public  boxweight(){
      this.weight=-1;
  }

      boxweight(boxweight other){
        super(other);
           this.weight=other.weight;    
    }
       boxweight(double l,double h,double w,double weight){
        super(l,w,h);
        this.weight=weight; 
       }
       boxweight(double side,double weight){
        super(side);
        this.weight=weight;
       }
      
       }
    