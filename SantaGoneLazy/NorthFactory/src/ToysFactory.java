public class ToysFactory {

    public Toys getToys (String requestedToy){

        Toys newToy=null;

        // if(requestedToy==null){
        //     return null;}
        
        if(requestedToy.equals("I need a doll")){
            return new Doll();
        }
        else if(requestedToy.equals("I need a bicycle")){
            return new Bicycle();
        }
        else return null;
    }

    
}
