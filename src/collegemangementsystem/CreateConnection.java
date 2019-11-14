package collegemangementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
    
    static Connection con=null;
    static Connection getObject() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");//.newInstance();
			
	//serverhost = localhost, port=3306, username=root, password=123
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","");
	//Statement smt=con.createStatement();
        
        return con;
    }
        
    }
 //   public static void main(String[] args) {}

