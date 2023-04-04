package pass;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class menu implements ActionListener {
	JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6,b7;

    menu(){
        f=new JFrame("Passport Management System");
        f.setBackground(Color.white);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel();
        l1.setBounds(0,0,800,600);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pass/icons/backg.jpg"));
        l1.setIcon(i1);
        f.add(l1);

        l2 = new JLabel("Main Menu");
        l2.setBounds(305,60,300,40);
        l2.setFont(new Font("serif",Font.BOLD,40));
        l2.setForeground(Color.white);
        l1.add(l2);

        b1=new JButton("Add");
        b1.setBounds(180,160,200,50);
        b1.setFont(new Font("serif",Font.BOLD,18));
        b1.addActionListener(this);
        l1.add(b1);


        b2=new JButton("Withdraw Passport");
        b2.setBounds(420,160,200,50);
        b2.setFont(new Font("serif",Font.BOLD,18));
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Update");
        b3.setBounds(180,230,200,50);
        b3.setFont(new Font("serif",Font.BOLD,18));
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("Search");
        b4.setBounds(420,230,200,50);
        b4.setFont(new Font("serif",Font.BOLD,18));
        b4.addActionListener(this);
        l1.add(b4);
        
        b5=new JButton("View All Records");
        b5.setBounds(180,300,200,50);
        b5.setFont(new Font("serif",Font.BOLD,18));
        b5.addActionListener(this);
        l1.add(b5);

        b6=new JButton("Remove");
        b6.setBounds(420,300,200,50);
        b6.setFont(new Font("serif",Font.BOLD,18));
        b6.addActionListener(this);
        l1.add(b6);

        b7=new JButton("Log Out");
        b7.setBounds(560,450,140,40);
        b7.setFont(new Font("serif",Font.BOLD,15));
        b7.addActionListener(this);
        l1.add(b7);
        
        f.setVisible(true);
        f.setSize(800,600);
        f.setLocation(100,100);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new add();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new passout();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new search(false);
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            new search(true);
        }
        if(ae.getSource()==b5){
            f.setVisible(false);
            new list();
        }
        if(ae.getSource()==b6){
            f.setVisible(false);
            new delete();
        }
        if(ae.getSource()==b7){
            System.exit(0);
        }
    }

    public static void main(String[ ] arg){
        @SuppressWarnings("unused")
		menu d = new menu();
    }

}
