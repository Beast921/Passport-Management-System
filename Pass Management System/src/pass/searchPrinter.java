package pass;

import java.awt.*;
import javax.swing.*;
import java.awt.print.*;
import java.sql.*;

public class searchPrinter implements Printable {
	String cpr_no,name,desn,dept,pass_no,pass_exp,cpr_exp,rp_exp,date_in,date_out,remark;
	String[] re=new String[5];

    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {

        if (page > 0) { 
            return NO_SUCH_PAGE;
        }
        
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        
        g.setFont(new Font("serif",Font.BOLD,20));
        g.drawString("Employee Details", 220, 80);
        
        g.setFont(new Font("serif",Font.PLAIN,16));
        g.drawString("CPR Number: ",100,150);
        g.drawString(cpr_no, 200, 150);
        g.drawString("Name: ", 100, 180);
        g.drawString(name,150,180);
        g.drawString("Designation: ", 100, 210);
        g.drawString(desn, 190, 210);
        g.drawString("Department: ", 100, 240);
        g.drawString(dept, 190, 240);
        g.drawString("Passport Number: ", 100, 270);
        g.drawString(pass_no, 222, 270);
        g.drawString("Passport Expiry: ", 100, 300);
        g.drawString(pass_exp, 215, 300);
        g.drawString("R/P Expiry: ", 100, 330);
        g.drawString(rp_exp, 185, 330);
        g.drawString("Date In: ", 100, 360);
        g.drawString(date_in, 160, 360);
        g.drawString("Date Out: ", 100, 390);
        if(date_out==null)
        	g.drawString("----------", 170, 390);
        else
        	g.drawString(date_out, 170, 390);
        g.drawString("Remark: ", 100, 420);
        if(remark==null||remark.length()==0)
        	g.drawString("----------", 165, 420);
        else
        {
        	//rem();
        	g.drawString(remark, 110, 440);
        	/*g.drawString(re[0], 110, 430);
        	if(!re[1].isEmpty())
        		g.drawString(re[1], 165, 440);
        	if(!re[2].isEmpty())
        		g.drawString(re[2], 165, 450);
        	if(!re[3].isEmpty())
        		g.drawString(re[3], 165, 460);*/
        }
        return PAGE_EXISTS;
    }
    
    void rem() {
    	int i=0,j=0;
    	while(i<remark.length()) {
    		String w="";
    		if(remark.charAt(i)!=' '||remark.charAt(i)=='.')
    		{
    			w+=remark.charAt(i);
    			re[j]+=w;
    			if(re[j].length()>=43)
    				j++;
    		}
    		else
    			w+=remark.charAt(i);
    	}
    }

    searchPrinter(String s) {
    	try{
            conn con = new conn();
            String str = "select * from employee where cpr_no = '"+s+"'";
            ResultSet rs= con.s.executeQuery(str);
            if(rs.next()) {
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
                PrinterJob job = PrinterJob.getPrinterJob();
                job.setPrintable(this);
                boolean ok = job.printDialog();
                if (ok) {
                    try {
                         job.print();
                         JOptionPane.showMessageDialog(null,"Printed successfully");
                    } catch (PrinterException ex) {
                        JOptionPane.showMessageDialog(null,"Error: "+ex,"Print Unsuccesful",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }catch(Exception e){}
    }

    public static void main(String args[]) {
 
       new search(true);
    }
}