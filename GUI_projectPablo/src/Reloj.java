
//@author Pablo
import javax.swing.JLabel;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Reloj extends Thread{
    
    private JLabel lbl;

    public Reloj(JLabel lbl) {
        this.lbl = lbl;
    }
    
    public void run(){
        while (true) {            
            Date hoy = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
            lbl.setText(s.format(hoy));
            try {
                sleep(1000);
            } catch (Exception e) {
                
            }
        }
    
    }
    
}
