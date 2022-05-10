/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import DashboardFrame.dashboardUserFrame;
import LoginFrame.loginUserFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import macamKoneksi.sessionLogin;

/**
 *
 * @author mac
 */
public class LoginQuery {
    public static void main(String[] args) {
        try{
            
            Connection konekDatabase = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_apotikMedikaSentoasa", "root", "kadekmontana050703");
            
            PreparedStatement konekstatement = konekDatabase.prepareStatement("Select user_name, pass_user from tb_user where user_name=? and pass_user=?");
            
            konekstatement.setString(1, "");
            konekstatement.setString(2, "");
            ResultSet hasilKonek = konekstatement.executeQuery();
            if (hasilKonek.next()) {
                JOptionPane.showMessageDialog(null, "You have successfully logged in");
                sessionLogin.set_nama("");
                loginUserFrame loginFrame = new loginUserFrame();
                loginFrame.dispose();
                dashboardUserFrame masukDashboard = new dashboardUserFrame();
                masukDashboard.show();
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Username & Password");
            }
        } catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}
