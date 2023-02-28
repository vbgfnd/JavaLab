package Swing;
import javax.swing.*;
import java.awt.*;

public class SwingDemo {
    
    public static void main(String args[]){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleFrame frame = new SimpleFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        }); 
    }
    
    static class SimpleFrame extends JFrame{
        private static final int DEFAULT_WIDTH = 300;
        private static final int DEFAULT_HEIGHT = 200;
        
        public SimpleFrame(){
            Toolkit kit = Toolkit.getDefaultToolkit();
            Dimension screenSize = kit.getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;
            setSize(screenWidth / 2, screenHeight / 2);
            
            add(new NotHelloWorldComponent());
            pack();
        }
    }
    static class NotHelloWorldComponent extends JComponent{
        public static final int MESSAGE_X = 75;
        public static final int MESSAGE_Y = 100;
        
        public void paintComponent(Graphics g){
            g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);
        }
        
        public static final int DEFAULT_WIDTH = 300;
        public static final int DEFAULT_HEIGHT = 200;
        
        public Dimension getPreferredSize(){
            return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        }
    }
}
