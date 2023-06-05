import javax.swing.*;
import java.awt.* ;

public class AutoCLickerApp {
    /* This file will  be responsible for creating and dealing with the graphical interface
    private variables
     */
    //      components/instances
    private JFrame frame;
    private JTextField cpsField;
    private JToggleButton actionTypeToggle;
    private Button toggleKeybindButton;
    private JComboBox<String> mouseButtonComboBox;
    private JButton StartButton;
    private JButton StopButton;
    private JButton exitButton;


    //function
    public AutoClickerUI() {
        frame = new JFrame("Auto Clicker");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());


        // keybinds names
        cpsField = new JTextField(10);
        actionTypeToggle = new JToggleButton("Toggle ACtion Type");
    }




}
