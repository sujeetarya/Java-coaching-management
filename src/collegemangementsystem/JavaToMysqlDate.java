package collegemangementsystem;

import java.text.SimpleDateFormat;
import java.util.Date;
public class JavaToMysqlDate {
    public static void main(String[] args) {
        
        Date now = new Date();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        String mysqlDateString = formatter.format(now);
        System.out.println("Java's Default Date Format: " + now);
        System.out.println("Mysql's Default Date Format: " + mysqlDateString);
    }
}