public class Batman extends Vigilante {

    private boolean batSignal = false;

    public Batman(int sidekicks, int crimesStopped){
        super("Bruce Wayne", "Batman", "The Bat Signal", sidekicks, crimesStopped); 
    }

    public void setBatSignal(boolean signal) {
        this.batSignal = signal;
    }

    public boolean getBatSignal() {
        return this.batSignal;
    }

    
}
