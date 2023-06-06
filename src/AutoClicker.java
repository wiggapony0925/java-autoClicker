import java.awt.*;
import java.awt.event.InputEvent;
public class AutoClicker {
    //instances
    private Robot robot;
    private boolean isRunning;
    public AutoClicker() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    // this is the start clicking functionality     method = function   mouseButton(left, middle, right)
    public void startClicking(int cps, int mouseButton) {
        isRunning = true;
       int delay = 1000 / cps; //calc the delay im miliseconds
    }


}



