

package testepdfbox;

import br.com.rendti.forms.FormTeste;
import javax.swing.JFrame;
import javax.swing.LayoutStyle;
import java.lang.Object;

/**
 *
 * @author rafael
 */
public class Testepdfbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // FormTeste frm = new FormTeste();
        
       // frm.show(true);
        
        
            JFrame frame = new JFrame("Title");
            frame.setSize(500,500);
            //frame.setLayout(new BorderLayout());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // as per your requirement.
            frame.add(new FormTeste());
            frame.setVisible(true);
    }
    
}
