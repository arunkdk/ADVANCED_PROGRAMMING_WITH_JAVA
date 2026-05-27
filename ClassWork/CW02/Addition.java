/*
GUI to take two numbers and print the result of addition.
Just the GUI not actually adding the numbers and showing the result.
 */

package ClassWork.CW02;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Addition {

    JFrame frame;
    JLabel first_lbl, second_lbl, result_lbl;
    JTextField first_txt, second_txt, result_txt;
    JButton add_btn;

    Addition() {
        frame = new JFrame("Addition");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        first_lbl = new JLabel("First Number");
        first_lbl.setBounds(20, 10, 200, 30);
        frame.add(first_lbl);

        first_txt = new JTextField();
        first_txt.setBounds(20, 60, 200, 30);
        frame.add(first_txt);

        second_lbl = new JLabel("Second Number");
        second_lbl.setBounds(20, 110, 200, 30);
        frame.add(second_lbl);

        second_txt = new JTextField();
        second_txt.setBounds(20, 160, 200, 30);
        frame.add(second_txt);

        result_lbl = new JLabel("Result");
        result_lbl.setBounds(20, 210, 200, 30);
        frame.add(result_lbl);

        result_txt = new JTextField();
        result_txt.setBounds(20, 260, 200, 30);
        frame.add(result_txt);

        add_btn = new JButton("Addition");
        add_btn.setBounds(20, 310, 200, 30);
        frame.add(add_btn);
    }
    public static void main(String[] args) {
        new Addition();
    }
}
