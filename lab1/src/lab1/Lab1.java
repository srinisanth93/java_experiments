/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Lab1{

    
    public static void main(String[] args) {
        JFrame frame=new JFrame("STUDENT Frame");
        
        JPanel panel=new JPanel();
          Color c=new Color(111, 143, 175);
          panel.setBackground(c);
           frame.add(panel);
         //button for view the result
        JButton btn=new JButton("CLICK ME");   
        
        JLabel labelName=new JLabel("Name : ");
              
         JTextArea t1=new JTextArea("");

         JLabel labelRoll=new JLabel("Roll : ");
      
         JTextArea t2=new JTextArea("");
         
         //Adding components
         panel.add(btn);         
         panel.add(labelName);
         panel.add(t1);
         panel.add(labelRoll);
         panel.add(t2);
        
       btn.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){

       t1.setText("SRINISANTH M");
       t2.setText("19ITR093");
       
}

});
       
         frame.setSize(500,600);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         frame.setVisible(true);
    }
    
}
