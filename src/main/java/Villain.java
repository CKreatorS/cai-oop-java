public class Villain extends BatChars{

    public int goons; 
    public int crimes;
    // Properties that are specific to Villians


    public Villain(String name, String alias, String gimic, int goons, int crimes) {
        super(name, alias, gimic);
        this.goons = goons; 
        this.crimes = crimes;

    }

    public int commitCrime() {
        return crimes += 1; 

    // Adds one to crimes commited. 
    }
    
}
