package automateyourjob;
import java.awt.EventQueue;
/**
 *
 * @author ntko
 */
public class AutomateYourJob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            Framework frame = new Framework();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);            
        });
    }
}
