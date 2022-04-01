package music.blog;
/* @author Hasin Sadique
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MyConnection {
     public static Connection getConnection(){
         
         Connection con=null;
         try{
            // Class.forName("com.mysql.jdbc.Driver");
             Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost/music_blog?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
             //jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
             System.out.println("kaj hoise..----->");
//Statement stmt=con.createStatement();
         }catch(Exception e){
             System.out.println("Kaj hobe nah");
             System.out.println(e.getMessage());
         }
     return con;
     }
}
