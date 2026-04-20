public class singletone {
     private  singletone(){

        }

  private static singletone instance;
  public static singletone getinstance(){
    if(
        instance ==null
    ){
        instance =new singletone();
    }

    return instance;
    



  }

  } 

    
