package pass;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class view implements ActionListener {
	JFrame f;
	JLabel fl,id,id1,l1,id2,l2,id3,l3,id4,l4,id5,l5,id6,l6,id7,l7,id8,l8,id9,l9,id10,l10,id11;
	JButton b1,b2;
	JTextArea ta;
	JScrollPane sc;
    String cpr_no,name,desn,dept,pass_no,pass_exp,cpr_exp,rp_exp,date_in,date_out,remark;
	ImageIcon ic;
	
	view(String s) {
		int i=0;
		f=new JFrame("Print Data");
        f.setBackground(Color.white);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        
		try{
            conn con = new conn();
            String str = "select * from employee where cpr_no = '"+s+"'";
            ResultSet rs= con.s.executeQuery(str);
            if(rs.next()) {
            	f.setVisible(true);
                name = rs.getString("name");
                desn = rs.getString("desn");
                dept = rs.getString("dept");
                pass_no = rs.getString("pass_no");
                remark = rs.getString("remark");
                pass_exp = String.valueOf(rs.getObject("pass_exp"));
                cpr_exp = String.valueOf(rs.getObject("cpr_exp"));
                rp_exp = String.valueOf(rs.getObject("rp_exp"));
                date_in = String.valueOf(rs.getObject("date_in"));
                date_out = String.valueOf(rs.getObject("date_out"));
                cpr_no = rs.getString("cpr_no");
                i=1;
            }
            if(i==0) {
            	JOptionPane.showMessageDialog(null,"ID not found.");
            	f.setVisible(false);
                new search(true);
            }
        }catch(Exception e){}
        
        fl=new JLabel();
        fl.setBounds(0,0,900,700);
        fl.setLayout(null);
        ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("pass/icons/backg.jpg"));
        fl.setIcon(ic);
        
        id = new JLabel("Employee Details");
        id.setBounds(290,30,400,50);
        id.setForeground(Color.WHITE);
        f.add(id);
        id.setFont(new Font("serif",Font.ITALIC,40));
        fl.add(id);
        f.add(fl);
        
        id1 = new JLabel("CPR Number:");
        id1.setBounds(50,110,120,30);
        id1.setForeground(Color.WHITE);
        id1.setFont(new Font("serif",Font.BOLD,20));
        fl.add(id1);
        
        l1 = new JLabel(cpr_no);
        l1.setBounds(200,110,200,30);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("serif",Font.BOLD,20));
        fl.add(l1);
        
        id2 = new JLabel("Name:");
        id2.setForeground(Color.WHITE);
        id2.setBounds(50,145,100,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        fl.add(id2);
        
        l2 = new JLabel(name);
        l2.setBounds(200,145,300,30);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("serif",Font.BOLD,20));
        fl.add(l2);
        
        id3 = new JLabel("Designation:"); 
        id3.setBounds(50,180,200,30);
        id3.setForeground(Color.WHITE);
        id3.setFont(new Font("serif",Font.BOLD,20));
        fl.add(id3);
        
        l3 = new JLabel(desn);
        l3.setBounds(200,180,300,30);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("serif",Font.BOLD,20));
        fl.add(l3);
        
        id4= new JLabel("Department:");
        id4.setBounds(50,215,200,30);
        id4.setForeground(Color.WHITE);
        id4.setFont(new Font("serif",Font.BOLD,20));
        fl.add(id4);
        
        l4 = new JLabel(dept);
        l4.setBounds(200,215,300,30);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("serif",Font.BOLD,20));
        fl.add(l4);
        
        id5= new JLabel("Passport Number:");  
        id5.setBounds(50,250,200,30);
        id5.setForeground(Color.WHITE);
        id5.setFont(new Font("serif",Font.BOLD,20));
        fl.add(id5);
        
        l5 = new JLabel(pass_no);
        l5.setBounds(225,250,150,30); 
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("serif",Font.BOLD,20));
        fl.add(l5);
        
        id6= new JLabel("Passport Expiry:");
        id6.setForeground(Color.WHITE);
        id6.setBounds(450,250,150,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        fl.add(id6);

        l6 = new JLabel(pass_exp);
        l6.setBounds(625,250,150,30);
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("serif",Font.BOLD,20));
        fl.add(l6);
        
        id7= new JLabel("CPR Expiry:");
        id7.setBounds(50,285,150,30);
        id7.setForeground(Color.WHITE);
        id7.setFont(new Font("serif",Font.BOLD,20));
        fl.add(id7);
        
        l7= new JLabel(cpr_exp);
        l7.setBounds(200,285,150,30); 
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("serif",Font.BOLD,20));
        fl.add(l7);
        
        id8= new JLabel("R/P Expiry:");
        id8.setBounds(450,285,150,30);
        id8.setForeground(Color.WHITE);
        id8.setFont(new Font("serif",Font.BOLD,20));
        fl.add(id8);
        
        l8 = new JLabel(rp_exp);
        l8.setBounds(600,285,150,30);
        l8.setForeground(Color.WHITE);
        l8.setFont(new Font("serif",Font.BOLD,20));
        fl.add(l8);
        
        id9= new JLabel("Date In:");
        id9.setBounds(50,320,150,30);
        id9.setForeground(Color.WHITE);
        id9.setFont(new Font("serif",Font.BOLD,20));
        fl.add(id9);

        l9= new JLabel(date_in);
        l9.setBounds(200,320,150,30); 
        l9.setForeground(Color.WHITE);
        l9.setFont(new Font("serif",Font.BOLD,20));
        fl.add(l9);
        
        id10= new JLabel("Date Out:");
        id10.setBounds(50,355,150,30);
        id10.setForeground(Color.WHITE);
        id10.setFont(new Font("serif",Font.BOLD,20));
        fl.add(id10);
        
        l10= new JLabel(date_out);
        l10.setBounds(200,355,150,30); 
        l10.setForeground(Color.WHITE);
        l10.setFont(new Font("serif",Font.BOLD,20));
        if(date_out=="null")
        	l10.setText("------");
        fl.add(l10);
        
        id11= new JLabel("Remark:");
        id11.setBounds(50,390,150,30);
        id11.setForeground(Color.WHITE);
        id11.setFont(new Font("serif",Font.BOLD,20));
        fl.add(id11);
        
        ta=new JTextArea();
        sc=new JScrollPane(ta);
        sc.setBounds(200, 390, 400, 80);
        ta.setEditable(false);
        ta.setText(remark);
        ta.setBackground(Color.black);
        ta.setForeground(Color.WHITE);
        ta.setLineWrap(true);
        fl.add(sc);
        
        b1=new JButton("Print");
        b1.setForeground(Color.BLACK);
        b1.setBounds(150,520,150,40);
        b1.addActionListener(this);
        fl.add(b1);
        
        b2=new JButton("Back");
        b2.setForeground(Color.BLACK);
        b2.setBounds(350,520,150,40);
        b2.addActionListener(this);
        fl.add(b2);
        
        f.setSize(900,700);
        f.setLocation(100,100);
	}
	
	public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            new searchPrinter(cpr_no);
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new search(true);
        }
    }
    public static void main(String[] args){
        new view("Print Data");
    }

}
