package pass;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class add implements ActionListener {
	 JFrame f;
	    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,lab,lab1;
	    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9;
	    JButton b,b1;

	    add(int i){}
	    
	    add(){
	        f = new JFrame("Add Employee");
	        f.setBackground(Color.white);
	        f.setLayout(null);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        id15=new JLabel();
	        id15.setBounds(0,0,900,700);
	        id15.setLayout(null);
	        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("pass/icons/backg.jpg"));
	        id15.setIcon(img);

	        id8 = new JLabel("New Employee Details");
	        id8.setBounds(320,30,500,50);
	        id8.setFont(new Font("serif",Font.ITALIC,25));
	        id8.setForeground(Color.white);
	        id15.add(id8);
	        f.add(id15);

	 
	        id1 = new JLabel("CPR Number");
	        id1.setBounds(100,150,150,30);
	        id1.setFont(new Font("serif",Font.BOLD,20));
	        id1.setForeground(Color.white);
	        id15.add(id1);

	        t1=new JTextField();
	        t1.setBounds(275,150,150,30);
	        t1.setForeground(Color.BLACK);
	        id15.add(t1);

	        id2 = new JLabel("Name");
	        id2.setBounds(475,150,150,30);
	        id2.setFont(new Font("serif",Font.BOLD,20));
	        id2.setForeground(Color.white);
	        id15.add(id2);

	        t2=new JTextField();
	        t2.setBounds(650,150,150,30);
	        t2.setForeground(Color.BLACK);
	        id15.add(t2);

	        id3= new JLabel("Designation");
	        id3.setBounds(100,200,150,30);
	        id3.setFont(new Font("serif",Font.BOLD,20));
	        id3.setForeground(Color.white);
	        id15.add(id3);

	        t3=new JTextField();
	        t3.setBounds(275,200,150,30);
	        t3.setForeground(Color.BLACK);
	        id15.add(t3);

	        id4= new JLabel("Department");  
	        id4.setBounds(475,200,150,30);
	        id4.setFont(new Font("serif",Font.BOLD,20));
	        id4.setForeground(Color.white);
	        id15.add(id4);

	        t4=new JTextField();
	        t4.setBounds(650,200,150,30);
	        t4.setForeground(Color.BLACK);
	        id15.add(t4);

	        id5= new JLabel("Passport Number");
	        id5.setBounds(100,250,160,30);
	        id5.setFont(new Font("serif",Font.BOLD,20));
	        id5.setForeground(Color.white);
	        id15.add(id5);

	        t5=new JTextField();
	        t5.setBounds(275,250,150,30);
	        t5.setForeground(Color.BLACK);
	        id15.add(t5);

	        id6= new JLabel("Passport Expiry");
	        id6.setBounds(475,250,150,30);
	        id6.setFont(new Font("serif",Font.BOLD,20));
	        id6.setForeground(Color.white);
	        id15.add(id6);

	        t6=new JTextField();
	        t6.setBounds(650,250,150,30);
	        t6.setForeground(Color.BLACK);
	        id15.add(t6);

	        id7= new JLabel("CPR Expiry");
	        id7.setBounds(100,300,150,30);
	        id7.setFont(new Font("serif",Font.BOLD,20));
	        id7.setForeground(Color.white);
	        id15.add(id7);

	        t7=new JTextField();
	        t7.setBounds(275,300,150,30);
	        t7.setForeground(Color.BLACK);
	        id15.add(t7);

	        id9= new JLabel("R/P Expiry");
	        id9.setBounds(475,300,150,30);
	        id9.setFont(new Font("serif",Font.BOLD,20));  
	        id9.setForeground(Color.white);
	        id15.add(id9);

	        t8=new JTextField();
	        t8.setBounds(650,300,150,30);
	        t8.setForeground(Color.BLACK);
	        id15.add(t8);

	        id10= new JLabel("Date in");
	        id10.setBounds(100,350,150,30);
	        id10.setFont(new Font("serif",Font.BOLD,20));
	        id10.setForeground(Color.white);
	        id15.add(id10);

	        t9=new JTextField();
	        t9.setBounds(275,350,150,30);
	        t9.setForeground(Color.BLACK);
	        id15.add(t9);

	        lab=new JLabel("Note: Dates MUST be entered in YYYY-MM-DD format.");
	        lab.setBounds(100,350,400,200);
	        lab.setFont(new Font("serif",Font.PLAIN,16));
	        lab.setForeground(Color.white);
	        id15.add(lab);

	        lab1=new JLabel();
	        lab1.setBounds(600,400,250,200);
	        id15.add(lab1);

	        b = new JButton("Add");
	        b.setBackground(Color.gray);
	        b.setForeground(Color.black);
	        b.setFont(new Font("serif",Font.BOLD,17));
	        b.setBounds(275,550,150,40);
	        
	        id15.add(b);

	        b1=new JButton("Cancel");   
	        b1.setBackground(Color.gray);
	        b1.setForeground(Color.black);
	        b1.setFont(new Font("serif",Font.BOLD,17));
	        b1.setBounds(475,550,150,40);
	        
	        id15.add(b1);
	        
	        b.addActionListener(this);
	        b1.addActionListener(this);
	        
	        f.setVisible(true);
	        f.setSize(900,700);
	        f.setLocation(100,100);
	    }

	    public void actionPerformed(ActionEvent ae){
	        if(ae.getSource() == b){
	            try{
	            	String a = t1.getText();
	    	        String bb = t2.getText();
	    	        String c = t3.getText();
	    	        String d = t4.getText();
	    	        String e = t5.getText();
	    	        String ff = t6.getText();
	    	        String g = t7.getText();
	    	        String h = t8.getText();
	    	        String i = t9.getText();
	            	Date d1=Date.valueOf(ff);
	    	        Date d2=Date.valueOf(g);
	    	        Date d3=Date.valueOf(h);
	    	        Date d4=Date.valueOf(i);
	                conn cc = new conn();
	                String q = "insert into employee(cpr_no,name,desn,dept,pass_no,pass_exp,cpr_exp,rp_exp,date_in) values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+d1+"','"+d2+"','"+d3+"','"+d4+"')";
	                cc.s.executeUpdate(q);
	                JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
	                f.setVisible(false);
	                new menu();
	            }catch(Exception ee){
	            	JOptionPane.showMessageDialog(null,"The error is:"+ee,"Error",JOptionPane.ERROR_MESSAGE);
	            }
	        }else if(ae.getSource() == b1){
	            f.setVisible(false);
	            new menu();
	        }
	    }
	    public static void main(String[ ] arg){
	        new add();
	    }
}
