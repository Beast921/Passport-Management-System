package pass;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class delete implements ActionListener {
	JFrame f;
    JTextField t;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,id;
    JButton b,b1,b2,b3;
    
    delete(){
        f=new JFrame("Delete Record");
        f.setBackground(Color.white);   
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l5=new JLabel();
        l5.setBounds(0,0,900,700);
        l5.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("pass/icons/backg.jpg"));
        l5.setIcon(img);
        
        id = new JLabel("Delete Employee Record");
        id.setBounds(320,30,500,50);
        id.setFont(new Font("serif",Font.ITALIC,25));
        id.setForeground(Color.white);
        l5.add(id);
        f.add(l5);
        
        l1=new JLabel("CPR Number:");
        l1.setBounds(50,100,250,30);
        l1.setForeground(Color.white);
        Font f2 = new Font("serif",Font.BOLD,25); 
        l1.setFont(f2);
        l5.add(l1);

        t=new JTextField();
        t.setBounds(250,100,150,30);
        l5.add(t);


        b=new JButton("Search");
        b.setBounds(200,150,100,30);
        b.addActionListener(this);
        l5.add(b);

        b3=new JButton("Back");
        b3.setBounds(360,150,100,30);   
        b3.addActionListener(this);
        l5.add(b3);


        l2=new JLabel("Name:"); 
        l2.setBounds(50,200,250,30);
        l2.setForeground(Color.white);
        Font f3 = new Font("serif",Font.BOLD,20); 
        l2.setFont(f3);
        l5.add(l2);

        l6=new JLabel();    
        l6.setBounds(230,200,350,30);
        l6.setForeground(Color.white);
        Font F6=new Font("serif",Font.BOLD,20); 
        l6.setFont(F6);
        l5.add(l6);

        l3=new JLabel("Designation:");
        l3.setBounds(50,235,250,30);
        l3.setForeground(Color.white);
        Font f4 = new Font("serif",Font.BOLD,20); 
        l3.setFont(f4);
        l5.add(l3);

        l7=new JLabel();
        l7.setBounds(230,235,350,30);
        l7.setForeground(Color.white);
        Font F7=new Font("serif",Font.BOLD,20); 
        l7.setFont(F7);
        l5.add(l7);

        l4=new JLabel("Department:");
        l4.setBounds(50,270,250,30);
        l4.setForeground(Color.white);
        Font F5=new Font("serif",Font.BOLD,20); 
        l4.setFont(F5);
        l5.add(l4);

        l8=new JLabel();
        l8.setBounds(230,270,350,30);
        l8.setForeground(Color.white);
        Font f8=new Font("serif",Font.BOLD,20); 
        l8.setFont(f8);
        l5.add(l8);
        
        l11=new JLabel("Passport Number:");
        l11.setBounds(50,305,250,30);
        l11.setForeground(Color.white);
        Font f11=new Font("serif",Font.BOLD,20); 
        l11.setFont(f11);
        l5.add(l11);
        
        l9=new JLabel();
        l9.setBounds(230,305,350,30);
        l9.setForeground(Color.white);
        Font f9=new Font("serif",Font.BOLD,20); 
        l9.setFont(f9);
        l5.add(l9);

        l12=new JLabel("Date In:");
        l12.setBounds(50,340,250,30);
        l12.setForeground(Color.white);
        Font f12=new Font("serif",Font.BOLD,20); 
        l12.setFont(f12);
        l5.add(l12);
        
        l10=new JLabel();
        l10.setBounds(230,340,350,30);
        l10.setForeground(Color.white);
        Font f10=new Font("serif",Font.BOLD,20); 
        l10.setFont(f10);
        l5.add(l10);
        
        l13=new JLabel("Date Out:");
        l13.setBounds(50,375,250,30);
        l13.setForeground(Color.white);
        Font f13=new Font("serif",Font.BOLD,20); 
        l13.setFont(f13);
        l5.add(l13);
        
        l14=new JLabel();
        l14.setBounds(230,375,250,30);
        l14.setForeground(Color.white);
        Font f14=new Font("serif",Font.BOLD,20); 
        l14.setFont(f14);
        l5.add(l14);
        
        b1=new JButton("Delete");
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

        f.setSize(900,700);
        f.setLocation(100,100);  
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
   	 if(ae.getSource()==b){
            try{
                conn con = new conn();
                String str = "select name,desn,dept,pass_no,date_in,date_out from employee where cpr_no='"+t.getText()+"' ";
                ResultSet rs = con.s.executeQuery(str);
                int i=0;
                if(rs.next()){
                    String s1 = rs.getString(1);
                    String s2= rs.getString(2);
                    String s3=rs.getString(3);
                    String s4=rs.getString(4);
                    String s5=String.valueOf(rs.getDate(5));
                    String s6=String.valueOf(rs.getDate(6));

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
                    l14.setText(s6);
                    l13.setVisible(true);
                    l14.setVisible(true);
                }
                if(i==0)
                    JOptionPane.showMessageDialog(null,"Id not found");
            }catch(Exception ex){}
        }
        if(ae.getSource()==b1){
        	int n = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete this record?",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION);
        	if (n == JOptionPane.YES_OPTION) {
            try{
                conn con = new conn();
                String str = "delete from employee where cpr_no = '"+t.getText()+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Deleted successfully");
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

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Exception occured while deleting record.\n "+ex,"Error",JOptionPane.ERROR_MESSAGE);
            }
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
       new delete();
   }
}
