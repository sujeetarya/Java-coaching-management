package collegemangementsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertImg {
    public static void main(String[] args) throws Exception {
        File f=new File("D:\\ARYA\\java\\CollegeMangementSystem\\src\\collegemangementsystem\\userName.png");
        Connection con;
        try {
            FileInputStream fil=new FileInputStream(f);
            con=CreateConnection.getObject();
                String sqlquery="INSERT INTO image(name,img) VALUES (?,?)";
                PreparedStatement pst = con.prepareStatement(sqlquery);
                pst.setString(1, "User_img");
                pst.setBinaryStream(2, fil);
                System.out.println("inserting image");
                int rs=pst.executeUpdate();
                if(rs==0){
                    System.out.println("image NOT inserted");
                }
                else{
                    System.out.println("image inserted");                   
                }
                pst.close();           
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(InsertImg.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
}
