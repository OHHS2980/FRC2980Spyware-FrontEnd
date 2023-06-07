import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class HomePage {
    private JPanel mainPanel;
    private JMenuBar menuBoi;
    private JScrollPane superRobotList;
    private JTable robotList;
    private JPanel sortOptionsPanel;


    Main main;


    public HomePage(Main m){
        main = m;

        menuBoi.add(new JMenu());

        betterTableModel betterModel = new betterTableModel();

        JTable robotList = new JTable(betterModel);


        superRobotList.setViewportView(robotList);
        robotList.addColumn(betterModel.addEPA());
        robotList.addColumn(betterModel.addEPA());
        robotList.addColumn(betterModel.addEPA());
        robotList.addColumn(betterModel.addEPA());
        betterModel.addRow();
        betterModel.addRow();
        betterModel.addRow();
        betterModel.addRow();
    }

    public JPanel getPanel(){
        return mainPanel;
    }
}
