import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;


public class AutoCLickerApp {
    /* This file will  be responsible for creating and dealing with the graphical interface
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
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());


        // keybinds names
        cpsField = new JTextField(10);
        actionTypeToggle = new JToggleButton("Toggle ACtion Type");
        keybindLabel = new JLabel("Toogle Keybind: None");
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
                autoClicker.startClicking(cps);
            }
        });


        // add to the frain
        frame.add(new JLabel("clicks per Secondl: "));
        frame.add(cpsField);
        // frame.add(actionTypeToggle);
        frame.add(keybindLabel);
        frame.add(toggleKeybindButton);
        frame.add(mouseButtonComboBox);
        frame.add(startButton);
        frame.add(stopButton);
        frame.add(exitButton);

        // show frame

        frame.setVisible(true);



    }

    public void ShowUI() {
        // show ui on the event dispactch Thread
        SwingUtilities.invokeLater(()-> {
            frame.setVisible(true);
        });
    }

    // events listerners from the AutoClicker Class
    private void addEventListeners() {
        startButton.addActionListener(e -> {
            int clicksPerSecond = Integer.parseInt(cpsField.getText());

        });
    }




}
