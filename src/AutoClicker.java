import java.awt.*;
import java.awt.event.InputEvent;
import java.util.function.IntToDoubleFunction;

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
    public void startClicking(int cps) {
        isRunning = true;
       int delay = 1000 / cps; //calc the delay im miliseconds

        while (isRunning) {
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }

        try {
            Thread.sleep(delay);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stopClicking() {
        isRunning = false;
    }


}



