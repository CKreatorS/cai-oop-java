import org.junit.jupiter.api.Test;

public class VigilanteTest {


    @Test
    public void testVigilante() {
        // Tests instance of Vigilante
        Vigilante nightwing = new Vigilante("Dick Grayson", "Nightwing", "Acrobatic", 0, 100); 
        assert nightwing instanceof Vigilante; 
    }
}