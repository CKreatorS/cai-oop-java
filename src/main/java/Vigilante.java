public class Vigilante extends BatChars{
    public int sidekicks;
    public int crimesStopped; 
    // Properties specific to vigilantes

    public Vigilante(String name, String alias, String gimic, int sidekicks, int crimesStopped) {
        super(name, alias, gimic); 
        this.sidekicks = sidekicks; 
        this.crimesStopped = crimesStopped;

    }

    public int stopCrime() {
        return crimesStopped += 1; 
    // Adds 1 to amount of crimes stopped. 
    }
}
