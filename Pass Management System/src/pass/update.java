package pass;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class update implements ActionListener {
	JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id15;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton b,b1,b2,b3; 
    String cprno;
    
    update(String idaa){
        f=new JFrame("update Employee details");
        f.setBackground(Color.white);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cprno=idaa;    
        id15=new JLabel();
        id15.setBounds(0,0,900,600);
        id15.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("pass/icons/backg.jpg"));
        id15.setIcon(img);

        id8 = new JLabel("Update Employee Detail:");
        id8.setBounds(50,20,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,40));
        id8.setForeground(Color.WHITE);
        id15.add(id8);
        f.add(id15);


        id1 = new JLabel("Name:");  
        id1.setBounds(50,110,150,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id1.setForeground(Color.WHITE);
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(250,110,150,30);
        id15.add(t1);

        id2 = new JLabel("CPR Number:");
        id2.setBounds(450,110,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id2.setForeground(Color.WHITE);
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(650,110,150,30);
        id15.add(t2);

        id3= new JLabel("Designation:");
        id3.setBounds(50,160,150,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id3.setForeground(Color.WHITE);
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(250,160,150,30);
        id15.add(t3);

        id4= new JLabel("Department:");
        id4.setBounds(450,160,150,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id4.setForeground(Color.WHITE);
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(650,160,150,30);   
        id15.add(t4);

        id5= new JLabel("Passport Number:");
        id5.setBounds(50,210,160,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id5.setForeground(Color.WHITE);
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(250,210,150,30);
        id15.add(t5);

        id6= new JLabel("Passport Expiry:");
        id6.setBounds(450,210,150,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id6.setForeground(Color.WHITE);
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(650,210,150,30);
        id15.add(t6);

        id7= new JLabel("CPR Expiry:");
        id7.setBounds(50,260,150,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id7.setForeground(Color.WHITE);
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(250,260,150,30);
        id15.add(t7);

        id9= new JLabel("R/P Expiry:");
        id9.setBounds(450,260,150,30);  
        id9.setFont(new Font("serif",Font.BOLD,20));
        id9.setForeground(Color.WHITE);
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(650,260,150,30);
        id15.add(t8);

        id10= new JLabel("Date In:");
        id10.setBounds(50,310,150,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id10.setForeground(Color.WHITE);
        id15.add(id10);
        f.setVisible(false);
        t9=new JTextField();
        t9.setBounds(250,310,150,30);
        id15.add(t9);

        b=new JButton("Update");
        b.setBounds(250,410,150,40);
        b.addActionListener(this);
        id15.add(b);

        b1=new JButton("Cancel");
        b1.setBounds(450,410,150,40);
        b1.addActionListener(this);
        id15.add(b1);

        showData(idaa);
    }

    int i=0;

    void showData(String s){
        try{
            conn con = new conn();
            String str = "select * from employee where cpr_no = '"+s+"'";
            ResultSet rs = con.s.executeQuery(str);

            if(rs.next()){
                f.setVisible(true);
                i=1;

                t1.setText(rs.getString(2));
                t2.setText(rs.getString(1));
                t3.setText(rs.getString(3));
                t4.setText(rs.getString(4));
                t5.setText(rs.getString(5));
                t6.setText(String.valueOf(rs.getString(6)));
                t7.setText(String.valueOf(rs.getString(7)));
                t8.setText(String.valueOf(rs.getString(8)));
                t9.setText(String.valueOf(rs.getString(9)));
            }
            if(i==0) {
                JOptionPane.showMessageDialog(null,"Id not found");
                f.setVisible(false);
                new search(false);
            }
        }catch(Exception ex){}
        f.setSize(900,600);
        f.setLocation(100,100);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b && i==1){
            try{
                conn con = new conn();
                String str = "update employee set cpr_no='"+t2.getText()+"',name='"+t1.getText()+"',desn='"+t3.getText()+"',dept='"+t4.getText()+"',pass_no='"+t5.getText()+"',pass_exp='"+Date.valueOf(t6.getText())+"',cpr_exp='"+Date.valueOf(t7.getText())+"',rp_exp='"+Date.valueOf(t8.getText())+"',date_in='"+Date.valueOf(t9.getText())+"' where cpr_no='"+cprno+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Successfully updated.");
                f.setVisible(false);
                new search(false);
            }catch(Exception e){
            	JOptionPane.showMessageDialog(null,"The error is:"+e);
            }
        }
        if(ae.getSource()==b1){
            f.setVisible(false);
            new menu();
        }
    }

    public static void main(String[] arg){
        new update("Update Employee");
    }
}
