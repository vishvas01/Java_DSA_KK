package adjava_ques;
import java.awt.*;
import java.beans.PropertyDescriptor;
import java.beans.PropertyEditorManager;
import java.beans.SimpleBeanInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class ShapeBean implements Serializable {
    private Color backgroundColor = Color.WHITE;
    private Color foregroundColor = Color.BLACK;
    private int width = 100;
    private int height = 100;
    private Shape shape = new Rectangle();

    public ShapeBean() {
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(backgroundColor);
        g2d.fillRect(0, 0, width, height);
        g2d.setColor(foregroundColor);
        g2d.draw(shape);
    }

     static class ShapeBeanInfo extends SimpleBeanInfo {
        private static final int PROPERTY_BACKGROUND_COLOR = 0;
        private static final int PROPERTY_FOREGROUND_COLOR = 1;
        private static final int PROPERTY_WIDTH = 2;
        private static final int PROPERTY_HEIGHT = 3;
        private static final int PROPERTY_SHAPE = 4;

        public PropertyDescriptor[] getPropertyDescriptors() {
            try {
                List<PropertyDescriptor> properties = new ArrayList<>();
                properties.add(new PropertyDescriptor("backgroundColor", ShapeBean.class,
                        "getBackgroundColor", "setBackgroundColor"));
                properties.add(new PropertyDescriptor("foregroundColor", ShapeBean.class,
                        "getForegroundColor", "setForegroundColor"));
                properties.add(new PropertyDescriptor("width", ShapeBean.class,
                        "getWidth", "setWidth"));
                properties.add(new PropertyDescriptor("height", ShapeBean.class,
                        "getHeight", "setHeight"));
                properties.add(new PropertyDescriptor("shape", ShapeBean.class,
                        "getShape", "setShape"));
                return properties.toArray(new PropertyDescriptor[0]);
            } catch (Exception e) {
                return null;
            }
        }
    }
}
// public class Q13 {
//     public static void main(String[] args) {
//         ShapeBean shape = new ShapeBean();
        
//         // Set the color property using a property editor
//         PropertyEditorManager.registerEditor(Color.class, ColorPropertyEditor.class);
//         ColorPropertyEditor colorEditor = (ColorPropertyEditor) PropertyEditorManager.findEditor(Color.class);
//         colorEditor.setValue("#FF0000");
//         shape.setColor((Color) colorEditor.getValue());
        
//         // Set the size and foreground properties
//         shape.setSize(100);
//         shape.setForeground(Color.WHITE);
        
//         // Add the shape to a frame
//         JFrame frame = new JFrame();
//         frame.add(shape);
//         frame.pack();
//         frame.setVisible(true);
//     }
// }



