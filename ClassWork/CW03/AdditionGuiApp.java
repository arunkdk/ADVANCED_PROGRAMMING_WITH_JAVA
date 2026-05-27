/*
GUI application to take two numbers as input and show the result to addition.
Handling the event handling within the class.
 */

package ClassWork.CW03;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionGuiApp extends JFrame implements ActionListener{

//    JFrame frame;
    JLabel first_lbl, second_lbl, result_lbl;
    JTextField first_txt, second_txt, result_txt;
    JButton add_btn;

    AdditionGuiApp() {
//        frame = new JFrame("Addition");
//        frame.setSize(400, 400);
//        frame.setLayout(null);
//        frame.setVisible(true);

        setTitle("Addition App");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        first_lbl = new JLabel("First Number");
        first_lbl.setBounds(20, 10, 200, 30);
//       frame.add(first_lbl);
        add(first_lbl);

        first_txt = new JTextField();
        first_txt.setBounds(20, 60, 200, 30);
//        frame.add(first_txt);
        add(first_txt);

        second_lbl = new JLabel("Second Number");
        second_lbl.setBounds(20, 110, 200, 30);
//        frame.add(second_lbl);
        add(second_lbl);

        second_txt = new JTextField();
        second_txt.setBounds(20, 160, 200, 30);
//        frame.add(second_txt);
        add(second_txt);

        result_lbl = new JLabel("Result");
        result_lbl.setBounds(20, 210, 200, 30);
//        frame.add(result_lbl);
        add(result_lbl);

        result_txt = new JTextField();
        result_txt.setBounds(20, 260, 200, 30);
//        frame.add(result_txt);
        add(result_txt);

        add_btn = new JButton("Addition");
        add_btn.setBounds(20, 310, 200, 30);
//        frame.add(add_btn);
        add(add_btn);

        add_btn.addActionListener(this);

        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        System.out.println("Clicked");  //only for testing
        String n1 = first_txt.getText();
        String n2 = second_txt.getText();
//        System.out.println("First number;"+n1);
//        System.out.println("Second number:"+n2);
        int sum = Integer.parseInt(n1) + Integer.parseInt(n2);
//        System.out.println("Sum:"+sum);
        result_txt.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        new AdditionGuiApp();
    }
}
