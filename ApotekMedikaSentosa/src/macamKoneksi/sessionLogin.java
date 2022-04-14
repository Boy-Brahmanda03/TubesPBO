/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macamKoneksi;

/**
 *
 * @author mac
 */
public class sessionLogin {
    private static String nama_login;
    
    
    public static String get_nama(){
        return nama_login;
    }
    public static void set_nama(String nama_login){
        sessionLogin.nama_login = nama_login;
    }
}
