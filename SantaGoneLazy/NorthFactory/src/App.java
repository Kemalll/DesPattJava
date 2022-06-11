
public class App {
    public static void main(String[] args) throws Exception {
        Santa santa = Santa.getInstance();
        santa.Laugh();
        
        santa.RunTheProgram();

        MagicBord magicBord=new MagicBord();
       
        Dwarfs drf1=new Dwarfs();
        Dwarfs drf2=new Dwarfs();
        magicBord.attach(drf1); 
        magicBord.attach(drf2);

        // magicBord.remove(drf2);


    }
}
