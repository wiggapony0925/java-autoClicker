import java.awt.*;
import java.awt.event.InputEvent;
public class AutoClicker {
    private Robot robot;

    public AutoClicker() {
        try {
            robot = new Robot();
        }catch (AWTException e) {
            e.printStackTrace();
        }
    }
    // this is the start clicking functionality     method = function   mouseButton(left, middle, right)
    public void startClicking(int clicksPerSecond, int mouseButton) {
        long delay = (long) (1000.0 / clicksPerSecond);  // calculates the delay of each click
    }
}
