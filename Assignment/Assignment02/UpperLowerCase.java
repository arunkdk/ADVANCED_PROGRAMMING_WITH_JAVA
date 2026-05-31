/*
GUI application to input string and change the string to upper or lower case,
according to user.
 */

package Assignment.Assignment02;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UpperLowerCase extends JFrame {

    JButton upper_btn, lower_btn;
    JTextField result_txt;

    UpperLowerCase() {
        setTitle("Case converting app");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        upper_btn = new JButton("To UPPER");
        upper_btn.setBounds(20, 20, 200, 40 );
        add(upper_btn);

        lower_btn = new JButton("To LOWER");
        lower_btn.setBounds(20, 70, 200, 40);
        add(lower_btn);

        result_txt = new JTextField();
        result_txt.setBounds(20, 120, 200, 40);
        add(result_txt);

        upper_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input = result_txt.getText();
                // or we can directly do, result_txt.setText(input.toUpperCase());
                String upper_case = input.toUpperCase();
                result_txt.setText(upper_case);
            }
        });

        lower_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input = result_txt.getText();
                String lower_case = input.toLowerCase();
                result_txt.setText(lower_case);
            }
        });

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UpperLowerCase();
    }
}