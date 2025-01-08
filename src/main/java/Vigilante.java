public class Vigilante extends BatChars{
    public int sidekicks;
    public int crimesStopped; 

    

    public Vigilante(String name, String alias, String gimic, int sidekicks, int crimesStopped) {
        super(name, alias, gimic); 
        this.sidekicks = sidekicks; 
        this.crimesStopped = crimesStopped;

    }
}
