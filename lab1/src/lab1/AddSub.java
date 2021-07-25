/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AddSub {
    
    public static void main(String agrs[])
    {
        Calc c=new Calc();
    }
       
}
class Calc  {
JTextField num1,num2;
JButton b;
JLabel res;
Calc(){
    JFrame frame=new JFrame();
    num1=new JTextField(15);
    num2=new JTextField(15);
    
    b=new JButton("OK");
    res=new JLabel("Result");
    
    add(num1);
    add(num2);
    add(b);
    add(res);
    
    b.addActionListener(e->{
        int n1=Integer.parseInt(num1.getText());
         int n2=Integer.parseInt(num2.getText());
         int r=n1+n2;
         res.setText(r+"");
        
    });
    
    setVisible(true);
    setLayout(new FlowLayout());
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

   
}