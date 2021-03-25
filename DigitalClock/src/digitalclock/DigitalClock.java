/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalclock;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author abhishek
 */
public class DigitalClock extends JFrame{
        JLabel jlabClock;
        ClockThread ct;
        
        public DigitalClock(){
            jlabClock = new JLabel("");
            setLayout(new FlowLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jlabClock.setFont(new Font("Arial",Font.CENTER_BASELINE,70));
            jlabClock.setOpaque(true);
            jlabClock.setBackground(Color.BLACK);
            jlabClock.setForeground(Color.WHITE);
            add(jlabClock);
            setSize(1200,120);
            setLocationRelativeTo(null);
            ct=new ClockThread(this);
            setVisible(true);
            
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new DigitalClock();
    }
    
}
