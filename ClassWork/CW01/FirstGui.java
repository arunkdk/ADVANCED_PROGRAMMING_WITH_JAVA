/*
simple GUI using java
 */
package ClassWork.CW01;
import javax.swing.JFrame;
public class FirstGui {
    JFrame frame;
    FirstGui() {
        frame = new JFrame("First GUI");
        // we can also do, frame.setTitle();
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new FirstGui();
    }
}