/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodgame;

import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

/**
 *
 * @author Justin
 */
public class PanScore extends JPanel {

    JLabel lblScore = new JLabel();
    int nScore = 0;
    int nTime = 0;
    JLabel lblTime = new JLabel();
    String sTime;
    Timer tmrTime = new Timer(true);

    public PanScore() {
        lblScore.setText("Score: " + nScore);
        add(lblScore);
        tmrTime.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                nTime++;
                sTime = Integer.toString(nTime);
                lblTime.setText("Time: " + sTime);
                add(lblTime);
                repaint();
                revalidate();
            }
        }, 0, 1000);

    }
}