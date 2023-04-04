package pass;

import java.io.*;
import java.sql.*;

import javax.swing.JOptionPane;

public class exportcsv {
	exportcsv(String filename) {
		String s = System.getProperty("user.home")+System.getProperty("file.separator")+"desktop"+System.getProperty("file.separator");
		sqltocsv(s+filename);
	}
	void sqltocsv(String fn) {
		try {
	         FileWriter fw = new FileWriter(fn + ".csv");
	         conn c=new conn();
	         String q="select * from employee";
	         ResultSet rs = c.s.executeQuery(q);

	         int cols = rs.getMetaData().getColumnCount();

	            fw.append("CPR Number");
	            fw.append(',');
	            fw.append("Name");
	            fw.append(',');
	            fw.append("Designation");
	            fw.append(',');
	            fw.append("Department");
	            fw.append(',');
	            fw.append("Passport Number");
	            fw.append(',');
	            fw.append("Passport Expiry");
	            fw.append(',');
	            fw.append("CPR Expiry");
	            fw.append(',');
	            fw.append("R/P Expiry");
	            fw.append(',');
	            fw.append("Date In");
	            fw.append(',');
	            fw.append("Date Out");
	            fw.append(',');
	            fw.append("Remark");
	            fw.append(',');
	            fw.append(System.getProperty("line.separator"));

	         while (rs.next()) {
	        	fw.append(rs.getString(1));
	        	fw.append(',');
	            for(int i = 2; i <= cols; ++i){
	            	if (rs.getObject(i) != null) {
	            		fw.append(String.valueOf(rs.getObject(i)));
	            		if(i < cols) fw.append(',');
	            	}
	            	else {
	            		fw.append("");
	            		if(i < cols) fw.append(',');
	            	}
	            }
	            fw.append(System.getProperty("line.separator"));
	        }
	        fw.flush();
	        fw.close();
	        JOptionPane.showMessageDialog(null, "Your file is ready at "+fn);
	        
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "An error occured.\n"+e,"Error",JOptionPane.ERROR_MESSAGE);
	    }
	}
	public static void main(String[]args) {
		new exportcsv("passport");
	}
}
