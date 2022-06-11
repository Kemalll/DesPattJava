public class Dwarfs implements Observer{

    private MagicBord magicBord;
    private Observable toy;

    @Override
    public void update() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setToy(Observable toy) {
        this.toy=toy;
    }
    
}
