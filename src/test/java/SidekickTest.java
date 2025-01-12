import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class SidekickTest {

    @Test
    public void testSidekickAssist() {
        // Tests Arraylist of sidekicks 
        Robin robin = new Robin();
        MissTuesday tuesday = new MissTuesday();

        ArrayList<Sidekick> sidekicks = new ArrayList<Sidekick>();
        sidekicks.add(robin);
        sidekicks.add(tuesday);

        for(Sidekick sidekick : sidekicks) {
            sidekick.assist();
        }
    }
    
}
