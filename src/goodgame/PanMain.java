/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goodgame;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Justin
 */
public class PanMain extends JPanel{
    JButton btnGame = new JButton();
    public PanMain(){ 
        setLayout(null);
        btnGame.setText("Play!");
        btnGame.setBounds(10, 10, 100, 100);
        add(btnGame);
    } 
}