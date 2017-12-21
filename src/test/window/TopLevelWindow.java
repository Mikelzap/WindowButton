package test.window;

import java.awt.*; 
import java.util.concurrent.ThreadLocalRandom;
import javafx.event.ActionEvent;
import javax.swing.*; 
 
 // Create a simple GUI window
 public class TopLevelWindow {
 
    public static void createWindow() {
 
       //Create and set up the window. 
        JFrame frame = new JFrame("Randomizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            int s;
            s = ThreadLocalRandom.current().nextInt(); //s is randomized.
            int rNew = Math.abs((s)%20); //gives absolute value limiting 0-19 and makes it rNew.
        JLabel textLabel = new JLabel("your roll is " +rNew,SwingConstants.CENTER); 
        textLabel.setPreferredSize(new Dimension(300, 100)); 
        frame.getContentPane().add(textLabel, BorderLayout.CENTER); 
        
        JButton reroll = new JButton("Click to reroll");
        reroll.getText("textLabel");
        
       //Display the window. 
       frame.setLocationRelativeTo(null); 
       frame.pack();
       frame.setVisible(true); 
    }
 
    public static void main(String[] args) 
    {
       createWindow();
    }
 } 