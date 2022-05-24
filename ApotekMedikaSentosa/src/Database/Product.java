/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author mac
 */
public class Product {
    private static String prodname;
    private static int id;
    private static String dosis;
    private static String aturanpakai;
    private static String kadaluarsa;
    private static String efeksamping;
    private static int harga;
    private static int jumlah;
    
    
    //setuname
    public static String get_prodname(){
        return prodname;
    }
    
    public static void set_prodname(String prodname){
        Product.prodname = prodname;
    }
    
    public static String get_efeksamping(){
        return efeksamping;
    }
    
    public static void set_efeksamping(String efeksamping){
        Product.efeksamping = efeksamping;
    }
    
    //set id
    public static int get_id(){
        return id;
    }
    
    public static void set_id(int id){
        Product.id = id;
    }
    
    //set name
    public static String get_dosis(){
        return dosis;
    }
    
    public static void set_dosis(String dosis){
        Product.dosis = dosis;
    }
    
    //set alamat
    public static String get_aturanpakai(){
        return aturanpakai;
    }
    
    public static void set_aturanpakai(String aturanpakai){
        Product.aturanpakai = aturanpakai;
    }
    
    //set no hp
    public static String get_kadaluarsa(){
        return kadaluarsa;
    }
    
    public static void set_kalauarsa(String kadaluarsa){
        Product.kadaluarsa = kadaluarsa;
    }
    
    //set jenis kelamin
    public static int get_harga(){
        return harga;
    }
    
    public static void set_harga(int harga){
        Product.harga = harga;
    }
    
    public static int get_jumlah(){
        return jumlah;
    }
    
    public static void set_jumlah(int jumlah){
        Product.jumlah = jumlah;
    }
}
