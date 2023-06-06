import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutoCLickerApp {
    /* This file will be responsible for creating and dealing with the graphical interface
    private variables
     */
    //      components/instances
    private AutoClicker autoClicker;
    private JFrame frame;
    private JTextField cpsField;
    private JToggleButton actionTypeToggle;
    private JButton toggleKeybindButton;
    private JComboBox<String> mouseButtonComboBox;
    private JButton startButton;
    private JButton stopButton;
    private JButton exitButton;
    private JLabel keybindLabel;


    //function
    public AutoCLickerApp() {
        frame = new JFrame("Auto Clicker");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // keybinds names
        cpsField = new JTextField(10);
        actionTypeToggle = new JToggleButton("Toggle Action Type");
        keybindLabel = new JLabel("Toggle Keybind: None");
        toggleKeybindButton = new JButton("Toggle Keybind");
        mouseButtonComboBox = new JComboBox<>(new String[]{"Left Button", "Right Button", "Middle Button"});
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        exitButton = new JButton("Exit");




        // MAKE THE ACTIONLISTENERS FOR THE BUTTONS
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cps = Integer.parseInt(cpsField.getText());
                autoClicker.startClicking(cps);                             //listeners
            }
        });
                //exit button
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        });
                //keys


        // add components to the frame
        frame.add(new JLabel("Clicks per Second: "));
        frame.add(cpsField);
        frame.add(keybindLabel);
        frame.add(toggleKeybindButton);
        frame.add(mouseButtonComboBox);
        frame.add(startButton);
        frame.add(stopButton);
        frame.add(exitButton);

        // Create an instance of the AutoClicker class
        autoClicker = new AutoClicker();

        // Show the frame
        frame.setVisible(true);
    }

    private void exit() {
        autoClicker.stopClicking();
        System.exit(0);
    }

}