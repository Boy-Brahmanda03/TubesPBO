package Database;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mac
 */
public class KonekDatabase {
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_tubesPBO", "root", "kadekmontana050703");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return con;
    }
}
