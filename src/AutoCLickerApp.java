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
    private JButton toggleKeybindButton;
    private JComboBox<String> mouseButtonComboBox;
    private JButton startButton;
    private JButton stopButton;
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
        toggleKeybindButton = new JButton("Toggle Keybind");
        mouseButtonComboBox = new JComboBox<>(new String[]{"Left Button", "Right Button", "Middle Button"});
        startButton = new JButton("Start");
        stopButton = new JButton("STop");

        // add to the frain




    }

    public void ShowUI() {
        // show ui on the event dispactch Thread
        SwingUtilities.invokeLater(()-> {
            frame.setVisible(true);
        });
    }




}
