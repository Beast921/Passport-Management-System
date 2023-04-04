package pass;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class list implements ActionListener {
	JFrame f;
    JLabel l1,l2,l3,l4,l5;
    JButton b1,b2;
    JTextField t;

    list(){
        f=new JFrame("Passport Management System-Consolidate");
        f.setBackground(Color.white);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel();
        l1.setBounds(0,0,700,500);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pass/icons/backg.jpg"));
        l1.setIcon(i1);
        f.add(l1);

        l2 = new JLabel("List of all records");
        l2.setBounds(220,50,300,40);
        l2.setFont(new Font("serif",Font.ITALIC,35));
        l2.setForeground(Color.white);
        l1.add(l2);
        
        String s="List of all employee records will be saved in the desktop as a .csv file.";
        l3 = new JLabel(s);
        l3.setBounds(70, 70, 600, 100);
        l3.setFont(new Font("serif",Font.PLAIN,20));
        l3.setForeground(Color.white);
        l1.add(l3);
        
        l4 = new JLabel("File Name:");
        l4.setBounds(100, 150, 100, 40);
        l4.setFont(new Font("serif",Font.BOLD,20));
        l4.setForeground(Color.white);
        l1.add(l4);
        
        t=new JTextField();
        t.setBounds(225,155,175,30);
        l1.add(t);
        
        l4 = new JLabel("Creating .csv file....");
        l4.setBounds(280, 270, 600, 100);
        l4.setFont(new Font("serif",Font.PLAIN,18));
        l4.setForeground(Color.YELLOW);
        l1.add(l4);
        
        b1=new JButton("Export to .csv");
        b1.setBounds(180,350,150,40);
        b1.setFont(new Font("serif",Font.BOLD,18));
        b1.addActionListener(this);
        l1.add(b1);

        b2=new JButton("Back");
        b2.setBounds(360,350,150,40);
        b2.setFont(new Font("serif",Font.BOLD,18));
        b2.addActionListener(this);
        l1.add(b2);
        
        l4.setVisible(false);
        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(100,100);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1) {
            l4.setVisible(true);
            new exportcsv(t.getText());
            f.setVisible(false);
            new menu();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new menu();
        }
    }

    public static void main(String[ ] arg){
        @SuppressWarnings("unused")
		list d = new list();
    }
}
