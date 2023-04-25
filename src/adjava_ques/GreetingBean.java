package adjava_ques;
import java.awt.Color;
import java.beans.*;

public class GreetingBean implements java.io.Serializable {
    private String greetingMessage;
    private Color backgroundColor;
    private Color foregroundColor;
    private int fontSize;
    
    public GreetingBean() {
        greetingMessage = "Hello, World!";
        backgroundColor = Color.WHITE;
        foregroundColor = Color.BLACK;
        fontSize = 12;
    }
    
    public void setGreetingMessage(String message) {
        greetingMessage = message;
    }
    
    public String getGreetingMessage() {
        return greetingMessage;
    }
    
    public void setBackgroundColor(Color color) {
        backgroundColor = color;
    }
    
    public Color getBackgroundColor() {
        return backgroundColor;
    }
    
    public void setForegroundColor(Color color) {
        foregroundColor = color;
    }
    
    public Color getForegroundColor() {
        return foregroundColor;
    }
    
    public void setFontSize(int size) {
        fontSize = size;
    }
    
    public int getFontSize() {
        return fontSize;
    }
}

class GreetingBeanBeanInfo extends SimpleBeanInfo {
    private static final int PROPERTY_GREETING_MESSAGE = 0;
    private static final int PROPERTY_BACKGROUND_COLOR = 1;
    private static final int PROPERTY_FOREGROUND_COLOR = 2;
    private static final int PROPERTY_FONT_SIZE = 3;
    
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor greetingMessageDescriptor = new PropertyDescriptor("greetingMessage", GreetingBean.class);
            PropertyDescriptor backgroundColorDescriptor = new PropertyDescriptor("backgroundColor", GreetingBean.class);
            PropertyDescriptor foregroundColorDescriptor = new PropertyDescriptor("foregroundColor", GreetingBean.class);
            PropertyDescriptor fontSizeDescriptor = new PropertyDescriptor("fontSize", GreetingBean.class);
            
            greetingMessageDescriptor.setDisplayName("Greeting Message");
            backgroundColorDescriptor.setDisplayName("Background Color");
            foregroundColorDescriptor.setDisplayName("Foreground Color");
            fontSizeDescriptor.setDisplayName("Font Size");
            
            PropertyDescriptor[] descriptors = { greetingMessageDescriptor, backgroundColorDescriptor,
                foregroundColorDescriptor, fontSizeDescriptor };
            return descriptors;
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }
    }
}