import java.util.Scanner;

public class Santa {

    private static Santa instance= new Santa();

    private Santa(){}
    
    public static Santa getInstance(){
        return instance;
    }

    public void Laugh(){
        System.out.println("  HoHoHo  ");
    }

    public void RunTheProgram(){
    

        //While loop (update for  )

        ToysFactory toysFactory = new ToysFactory();
        Toys theToy=null;
        Scanner userInput= new Scanner(System.in);
        
        System.out.println("What do you need?");  
                 
        if(userInput.hasNextLine()){

            String requestedToy = userInput.nextLine();
            theToy= toysFactory.getToys(requestedToy);
            if(theToy!=null){
                theToy.show();
            }else   
            System.err.println("Use (I need a doll) or (I need a bicycle) to recive the toy");


        }      
    }

}
