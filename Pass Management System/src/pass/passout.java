package pass;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class passout implements ActionListener {
	JFrame f;
    JTextField t,t1;
    JTextArea ta;
    JScrollPane sc;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
    JButton b,b1,b2,b3;
    
    passout(){
        f=new JFrame("Passport Out");
        f.setBackground(Color.white);   
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l5=new JLabel();
        l5.setBounds(0,0,900,700);
        l5.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("pass/icons/backg.jpg"));
        l5.setIcon(img);
        f.add(l5);

        
        l1=new JLabel("CPR Number:");
        l1.setBounds(50,50,250,30);
        l1.setForeground(Color.white);
        Font f2 = new Font("serif",Font.BOLD,25); 
        l1.setFont(f2);
        l5.add(l1);

        t=new JTextField();
        t.setBounds(250,50,150,30);
        l5.add(t);


        b=new JButton("Search");
        b.setBounds(200,100,100,30);
        b.addActionListener(this);
        l5.add(b);

        b3=new JButton("Back");
        b3.setBounds(360,100,100,30);   
        b3.addActionListener(this);
        l5.add(b3);


        l2=new JLabel("Name:"); 
        l2.setBounds(50,150,250,30);
        l2.setForeground(Color.white);
        Font f3 = new Font("serif",Font.BOLD,20); 
        l2.setFont(f3);
        l5.add(l2);

        l6=new JLabel();    
        l6.setBounds(230,150,350,30);
        l6.setForeground(Color.white);
        Font F6=new Font("serif",Font.BOLD,20); 
        l6.setFont(F6);
        l5.add(l6);

        l3=new JLabel("Designation:");
        l3.setBounds(50,185,250,30);
        l3.setForeground(Color.white);
        Font f4 = new Font("serif",Font.BOLD,20); 
        l3.setFont(f4);
        l5.add(l3);

        l7=new JLabel();
        l7.setBounds(230,185,350,30);
        l7.setForeground(Color.white);
        Font F7=new Font("serif",Font.BOLD,20); 
        l7.setFont(F7);
        l5.add(l7);

        l4=new JLabel("Department:");
        l4.setBounds(50,220,250,30);
        l4.setForeground(Color.white);
        Font F5=new Font("serif",Font.BOLD,20); 
        l4.setFont(F5);
        l5.add(l4);

        l8=new JLabel();
        l8.setBounds(230,220,350,30);
        l8.setForeground(Color.white);
        Font f8=new Font("serif",Font.BOLD,20); 
        l8.setFont(f8);
        l5.add(l8);
        
        l11=new JLabel("Passport Number:");
        l11.setBounds(50,255,250,30);
        l11.setForeground(Color.white);
        Font f11=new Font("serif",Font.BOLD,20); 
        l11.setFont(f11);
        l5.add(l11);
        
        l9=new JLabel();
        l9.setBounds(230,255,350,30);
        l9.setForeground(Color.white);
        Font f9=new Font("serif",Font.BOLD,20); 
        l9.setFont(f9);
        l5.add(l9);

        l12=new JLabel("Date In:");
        l12.setBounds(50,290,250,30);
        l12.setForeground(Color.white);
        Font f12=new Font("serif",Font.BOLD,20); 
        l12.setFont(f12);
        l5.add(l12);
        
        l10=new JLabel();
        l10.setBounds(230,290,350,30);
        l10.setForeground(Color.white);
        Font f10=new Font("serif",Font.BOLD,20); 
        l10.setFont(f10);
        l5.add(l10);
        
        l13=new JLabel("Date Out:");
        l13.setBounds(50,340,250,30);
        l13.setForeground(Color.white);
        Font f13=new Font("serif",Font.BOLD,20); 
        l13.setFont(f13);
        l5.add(l13);
        
        t1=new JTextField();
        t1.setBounds(200,344,150,25);
        l5.add(t1);
        
        l15=new JLabel("(YYYY-MM-DD)");
        l15.setBounds(375,340,250,30);
        l15.setForeground(Color.white);
        Font f15=new Font("serif",Font.PLAIN,12); 
        l15.setFont(f15);
        l5.add(l15);
        
        l14=new JLabel("Remark:");
        l14.setBounds(50,385,250,30);
        l14.setForeground(Color.white);
        Font f14=new Font("serif",Font.BOLD,20); 
        l14.setFont(f14);
        l5.add(l14);
        
        ta=new JTextArea();
        sc=new JScrollPane(ta);
        sc.setBounds(200, 385, 400, 80);
        ta.setLineWrap(true);
        l5.add(sc);
        
        l16=new JLabel("Please avoid using enter key in 'Remark' area");
        l16.setBounds(610,385,250,30);
        l16.setForeground(Color.white);
        Font f16=new Font("serif",Font.PLAIN,13); 
        l16.setFont(f16);
        l5.add(l16);
        
        b1=new JButton("Submit");
        b1.setBounds(150,500,125,40);
        b1.addActionListener(this);
        l5.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(315,500,125,40);
        b2.addActionListener(this);
        l5.add(b2);
        
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l11.setVisible(false);
        l12.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        l13.setVisible(false);
        l14.setVisible(false);
        l15.setVisible(false);
        l16.setVisible(false);
        t1.setVisible(false);
        sc.setVisible(false);

        f.setSize(900,700);
        f.setLocation(100,100);  
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
    	 if(ae.getSource()==b){
             try{
                 conn con = new conn();
                 String str = "select name,desn,dept,pass_no,date_in from employee where cpr_no='"+t.getText()+"' ";
                 ResultSet rs = con.s.executeQuery(str);
                 int i=0;
                 if(rs.next()){
                     String s1 = rs.getString(1);
                     String s2= rs.getString(2);
                     String s3=rs.getString(3);
                     String s4=rs.getString(4);
                     String s5=String.valueOf(rs.getDate(5));

                     l2.setVisible(true);
                     l3.setVisible(true);
                     l4.setVisible(true);
                     l11.setVisible(true);
                     l12.setVisible(true);
                     b1.setVisible(true);
                     b2.setVisible(true);    
                     i=1;
                     l6.setText(s1);
                     l7.setText(s2);
                     l8.setText(s3);
                     l9.setText(s4);
                     l10.setText(s5);
                     l13.setVisible(true);
                     l14.setVisible(true);
                     l15.setVisible(true);
                     l16.setVisible(true);
                     t1.setVisible(true);
                     sc.setVisible(true);
                 }
                 if(i==0)
                     JOptionPane.showMessageDialog(null,"Id not found");
             }catch(Exception ex){}
         }
         if(ae.getSource()==b1){
             try{
                 conn con = new conn();
                 String str = "update employee set date_out='"+t1.getText()+"',remark='"+ta.getText()+"' where cpr_no = '"+t.getText()+"'";
                 con.s.executeUpdate(str);
                 JOptionPane.showMessageDialog(null,"Updated successfully");
                 l2.setVisible(false);
                 l3.setVisible(false);
                 l4.setVisible(false);
                 l11.setVisible(false);
                 l12.setVisible(false);
                 l6.setVisible(false);
                 l7.setVisible(false);
                 l8.setVisible(false);
                 l9.setVisible(false);
                 l10.setVisible(false);
                 b1.setVisible(false);
                 b2.setVisible(false);
                 l13.setVisible(false);
                 l14.setVisible(false);
                 l15.setVisible(false);
                 l16.setVisible(false);
                 t1.setVisible(false);
                 sc.setVisible(false);

             }catch(Exception ex){
                 JOptionPane.showMessageDialog(null,"Exception occured while updating record.\n "+ex,"Error",JOptionPane.ERROR_MESSAGE);
             }
         }
         if(ae.getSource()==b2){
             f.setVisible(false);
             new menu();
             
         }
         if(ae.getSource()==b3){
             f.setVisible(false);
             new menu();
         }
    }
    
    public static void main(String[]ar){
        new passout();
    }
}
