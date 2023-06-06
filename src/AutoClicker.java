import java.awt.*;
import java.awt.event.InputEvent;
public class AutoClicker {
    //instances
    private Robot robot;

    public AutoClicker() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    // this is the start clicking functionality     method = function   mouseButton(left, middle, right)
    public void startClicking(int clicksPerSecond, int mouseButton) {
        int clickDelay = (int) (1000.0 / clicksPerSecond);  //changed from long => int

        while (true) {
            if (MouseInfo.getPointerInfo().getLocation().x < 0) {
                break; // Stop clicking if the mouse moves off the screen
            }

            robot.mousePress(mouseButton);
            robot.delay(20); // Delay for mouse press
            robot.mouseRelease(mouseButton);
            robot.delay(clickDelay);
        }
    }
}



