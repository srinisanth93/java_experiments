/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Lab1{
    public static void main(String[] args) {
        JFrame frame=new JFrame("STUDENT Frame");
        JPanel panel=new JPanel();
          Color c=new Color(111, 143, 175);
          panel.setBackground(c);
           frame.add(panel);
         //button for view the result
      
        
        JLabel labelName=new JLabel("Name : ");
              
         JTextField t1=new JTextField(15);

         JLabel labelRoll=new JLabel("Roll : ");
      
         JTextField t2=new JTextField(15);
         JButton btn=new JButton("CLICK ME");  
         btn.setActionCommand("Button");
         
         //Adding components
         panel.add(btn);         
         panel.add(labelName);
         panel.add(t1);
         panel.add(labelRoll);
         panel.add(t2);
        
       btn.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String name=t1.getText();
            String roll=t2.getText();
//        String s=e.getActionCommand();
        
//        if(s.equals("Button"))
            JOptionPane.showMessageDialog(null,"Submmited");
         
       t1.setText(name);
       btn.setText(roll);
       btn.setBackground(Color.green);
       
}

});
       
         frame.setSize(500,600);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
    }
    
}
