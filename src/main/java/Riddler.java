public class Riddler extends Villain{

    private String createRiddle; 

    public Riddler(String name, String alias, String gimic, int goons, int crimes){
        super("Edward Nygma", "Riddler", "riddles", goons, crimes); 

    }

    public void setcreateRiddle(String riddle) {
        this.createRiddle = "The more places I am, the less you can see. What am I?"; 
    }
    
    public String getcreateRiddle() {
        return this.createRiddle; 
    }
}
