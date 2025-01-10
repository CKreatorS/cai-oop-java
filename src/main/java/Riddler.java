public class Riddler extends Villain{

    private int createRiddle = 0; 

    public Riddler(String name, String alias, String gimic, int goons, int crimes){
        super("Edward Nygma", "Riddler", "riddles", goons, crimes); 

    }

    public void setcreateRiddle(int riddle) {
        this.createRiddle = riddle; 
    }
    
    public int getcreateRiddle() {
        return this.createRiddle += 1;
    }
}
