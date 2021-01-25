import javax.swing.*;

import java.awt.*;
import java.lang.System.*;

public class ov18
{
    public static void main (String[] args)

    {
        JOptionPane.showMessageDialog( null,"Hej! "
                + "\nDu använder nu " + System.getProperty("os.name") );

        Toolkit.getDefaultToolkit().beep();
    }
}
