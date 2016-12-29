
/**
 *
 * @author Pablo
 */
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;      
public class soloMinuscula extends PlainDocument{
   
    
    @Override
    public void insertString(int offset, String str, AttributeSet atrr)throws BadLocationException{
        super.insertString(offset, str.toLowerCase(), atrr);
    }
}
