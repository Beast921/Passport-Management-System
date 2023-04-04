package pass;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Front_Page implements ActionListener{
	JFrame f; 
    JLabel id,l1;
    JButton b;

    Front_Page(){
 
        f=new JFrame("Employee Management System");
        f.setBackground(Color.red);
        f.setLayout(null);
       
        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.red);
        b.setForeground(Color.WHITE);
        

        b.setBounds(350,600,300,70);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1000,750);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(45,30,1000,100);
        lid.setFont(new Font("serif",Font.BOLD,50));
        lid.setForeground(Color.white);
        id.add(lid);

        id.add(b);
        f.add(id);
        
        
        f.getContentPane().setBackground(Color.black);

        f.setVisible(true);
        f.setSize(1000,750);
        f.setLocation(50,50);

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new login();
        }
    }

    public static void main(String[] arg){
        @SuppressWarnings("unused")
		Front_Page f = new Front_Page();
    }
}
