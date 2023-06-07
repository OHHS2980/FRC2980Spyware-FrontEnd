import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    HomePage h;
    public Main(String title){
        super(title);

        h = new HomePage(this);

        setSize(new Dimension(600,500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(h.getPanel());
        setVisible(true);
    }

    public static void main(String[] args) {
        FlatMacDarkLaf.setup();
        new Main("FRC 2980 Spyware (Windows) V0.0");
    }
}