/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
