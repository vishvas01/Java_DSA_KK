package adjava_ques;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Q13 {

    public static void main(String[] args) {
        // Create a ShapeBean instance
        ShapeBean shapeBean = new ShapeBean();

        // Set the shape to an oval and the background/foreground colors to red/green
        shapeBean.setShape(new Ellipse2D.Double(0, 0, 100, 50));
        shapeBean.setBackgroundColor(Color.RED);
        shapeBean.setForegroundColor(Color.GREEN);

        // Set the size of the shape
        shapeBean.setWidth(200);
        shapeBean.setHeight(100);

        // Draw the shape on a JPanel
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                shapeBean.draw(g);
            }
        };

        // Display the JPanel in a JFrame
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
