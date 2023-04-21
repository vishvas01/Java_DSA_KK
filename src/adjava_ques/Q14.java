package adjava_ques;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
public class Q14 {
    public static void main(String[] args) {
        GreetingBean greeting = new GreetingBean();
        greeting.setGreetingMessage("Hello,This is Java Beans!");
        greeting.setBackgroundColor(Color.YELLOW);
        greeting.setForegroundColor(Color.BLUE);
        greeting.setFontSize(24);
        greeting.getGreetingMessage();
        greeting.getBackgroundColor();
        greeting.getForegroundColor();
        greeting.getFontSize();

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                GreetingBean.draw(g);
            }
        };
    }
}