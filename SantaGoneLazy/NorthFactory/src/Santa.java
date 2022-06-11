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
    
        boolean isRunning=true;
        ToysFactory toysFactory = new ToysFactory();

        //While loop (update)
        while(isRunning){
            String requestedToy;
            Scanner userInput= new Scanner(System.in);

            Toys theToy=null;
            System.out.println("What do you need?");  

            if(userInput.hasNextLine()){ 

              requestedToy = userInput.nextLine();
              theToy= toysFactory.getToys(requestedToy);
                if(theToy!=null){
                    theToy.show();
                }
                else if(requestedToy.equals("x")){
                    userInput.close();
                    System.out.println("You have closed the program"); break;
                       
                    }
                    else{
                    System.out.println("Use (I need a doll) or (I need a bicycle) to recive the toy or to exit type 'x'");
                }
            }   
    
        }
    }
}