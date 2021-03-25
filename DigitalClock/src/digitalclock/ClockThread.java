/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalclock;
import java.util.*;

/**
 *
 * @author abhishek
 */
public class ClockThread extends Thread{
    DigitalClock dc;
    String time;
    
    public ClockThread(DigitalClock dc){
        this.dc=dc;
        start();
        
    }
    public void run(){
        while(true){
            time = ""+new Date();
            dc.jlabClock.setText(time);
        }
    }
}
