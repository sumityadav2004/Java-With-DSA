public class boxprice extends boxweight {
    double cost;

     boxprice(){
        super();
        this.cost=-1;
     }

     boxprice(boxprice other){
        super(other);
        this.cost=other.cost;
     }
     boxprice(double l,double w,double h,double weight,double cost){
        super(l,h,w,weight);
        this.cost=cost;
     }
     boxprice(double side,double weight,double cost){
        super(side,weight);
        this.cost=cost;
     }
}
