import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calulate {
    Calulate() {
        // create an object frame named "f"
        JFrame f = new JFrame("Sample App");

        // create an object button named "b" and set size
        JButton b = new JButton("Calculate");
        b.setBounds(100, 150, 140, 40);

        // create a label to guide the user, set Size and its name
        JLabel label = new JLabel();
        label.setText("Enter Amount :");
        label.setBounds(10, 10, 100, 100);

        JLabel label1 = new JLabel();
        label1.setBounds(10, 110, 200, 100);

        final JTextField textfeld1 = new JTextField();
        textfeld1.setBounds(110, 50, 130, 30);
        JLabel label2 = new JLabel();

        label2.setText("Enter Tax(%):");

        label2.setBounds(10, 65, 100, 100);

        final JLabel label3 = new JLabel();

        label3.setBounds(5, 170, 300, 150);

        final JTextField textfield2 = new JTextField();

        textfield2.setBounds(110, 100, 130, 30);

        f.add(label1);

        f.add(textfeld1);

        f.add(label);

        f.add(label2);

        f.add(textfield2);

        f.add(label3);

        f.add(b);

        f.setSize(350, 350);

        f.setLayout(null);

        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent arg0) {

                double amount = Double.parseDouble(textfeld1.getText());

                double tax = Double.parseDouble(textfield2.getText());

                double taxamount = (amount * tax) / 100;

                System.out.println("amount:" + amount);

                System.out.println("amount:" + taxamount);

                double netamount = amount - taxamount;

                System.out.println("amount:" + netamount);

                label3.setText("Tax amount is: " + taxamount + " " + "\n Net amount is: " + netamount);

            }

        });

    }

    public static void main(String[] args) {

        new Calulate();


    }

}

