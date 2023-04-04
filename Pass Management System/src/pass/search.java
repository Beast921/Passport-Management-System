package pass;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class search implements ActionListener {
	JFrame f;
    JTextField t;
    JLabel l,l5;
    JButton b,b2;
    boolean a;

    search(boolean i){
        f=new JFrame("Search");
        f.setBackground(Color.black);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a=i;

        l5=new JLabel();
        l5.setBounds(0,0,550,300);
        l5.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("pass/icons/backg.jpg"));
        l5.setIcon(img);


        l=new JLabel("CPR Number:");
        l.setVisible(true);
        l.setBounds(45,50,250,30);
        l.setForeground(Color.white);
        Font F1=new Font("serif",Font.BOLD,25);
        l.setFont(F1); 
        l5.add(l);
        f.add(l5);

        t=new JTextField();
        t.setBounds(255,50,220,30);
        l5.add(t);

        b=new JButton("Search");
        b.setBounds(255,150,100,30);
        b.addActionListener(this);
        l5.add(b);


        b2=new JButton("Cancel");
        b2.setBounds(375,150,100,30);
        b2.addActionListener(this);
        l5.add(b2);

        f.setSize(550,300);
        f.setLocation(100,100);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            f.setVisible(false);
            new menu();
        }
        if(ae.getSource()==b){
        	if(a==true)
            	new view(t.getText());
            else
            	new update(t.getText());
            f.setVisible(false);
        }

    }
    
    public static void main(String[]ar){
        new search(true);
    } 	
}
