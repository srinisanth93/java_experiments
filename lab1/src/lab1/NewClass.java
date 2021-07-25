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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NewClass{
    public static void main(String[] args) {
        JFrame frame=new JFrame("STUDENT Frame");
           
         //button for view the result
      
        
        JLabel labelName=new JLabel("Name : ");
             
         JTextField t1=new JTextField(15);

         JLabel labelRoll=new JLabel("Roll : ");  
         
         JTextField t2=new JTextField(15);
         
         JLabel res=new JLabel();
         JButton btn=new JButton("SUBBMIT");  
         frame.add(btn);
                  btn.setBounds(100, 200, 100, 40);
         //Adding components
       
        
         frame.add(labelName);
         labelName.setBounds(50, 50, 150, 40);
         frame.add(t1);
         t1.setBounds(100, 50, 150, 40);
         frame.add(labelRoll);
         labelRoll.setBounds(50, 100, 150, 40);
         frame.add(t2);
         t2.setBounds(100, 100, 150, 40);
         frame.add(res);
         res.setBounds(50, 300, 1000, 50);
         
         
        
       btn.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String name=t1.getText();
            String roll=t2.getText();
//        String s=e.getActionCommand();
        
        if(!name.isEmpty() && !roll.isEmpty())
        {
            res.setText("Hai "+name.toUpperCase()+" Your Roll numer is \""+roll.toUpperCase()+"\"");
            JOptionPane.showMessageDialog(frame,"Submmited");
       
            btn.setBackground(Color.green);
            t1.setText("");
            t2.setText("");
        }
              
        else
        {
            JOptionPane.showMessageDialog(frame,"Enter Valid Details!!");
             btn.setBackground(Color.red);
        }
         
       
       
}

});
         frame.setLayout(null);
         frame.setSize(500,600);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
    }
    
}
