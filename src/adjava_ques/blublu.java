package adjava_ques;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

class JRadioButtonDemo {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("JRadioButton Demo");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Create a ButtonGroup to group the radio buttons
                ButtonGroup group = new ButtonGroup();

                // Create three radio buttons
                JRadioButton radioButton1 = new JRadioButton("Option 1");
                JRadioButton radioButton2 = new JRadioButton("Option 2");
                JRadioButton radioButton3 = new JRadioButton("Option 3");

                // Add the radio buttons to the ButtonGroup
                group.add(radioButton1);
                group.add(radioButton2);
                group.add(radioButton3);

                // Add the radio buttons to a panel
                JPanel panel = new JPanel(new GridLayout(0, 1));
                panel.add(radioButton1);
                panel.add(radioButton2);
                panel.add(radioButton3);

                // Add the panel to the frame
                frame.add(panel, BorderLayout.CENTER);

                // Add a label to display the selected radio button
                JLabel label = new JLabel("Selected Option:");
                frame.add(label, BorderLayout.SOUTH);

                // Set the frame size and make it visible
                frame.setSize(300, 200);
                frame.setVisible(true);
            }
        });
    }
}

