/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DashboardFrame;

import Database.KonekDatabase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class Pembelian {

    //method kurang stok
    
//untuk obat
    public int beli(int qty, int id){
        int stok;
        int val = 0;
        String stId = String.valueOf(id);
        try {
            String query = "Select * from obat where id_obat = "+ stId;
            PreparedStatement ps = KonekDatabase.getConnection().prepareStatement(query);
            ResultSet rs  = ps.executeQuery();
            if (rs.next()) {
                stok = rs.getInt(4);
                if (qty > stok) {
                    JOptionPane.showMessageDialog(null, "Stok kurang");
                    val = 0;
                } else {
                    int jml = stok - qty;
                    System.out.println(jml);
                    String update = "UPDATE obat set stok_obat = ? where id_obat ='"+stId+"'";;
                    PreparedStatement ps1 = KonekDatabase.getConnection().prepareStatement(update);
                    ps1.setString(1, String.valueOf(jml));
                    ps1.executeUpdate();
                    val = 1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;
    }

//untuk barang
    public int beli(int qty, String nama){
        int stok;
        int val = 0;
        String id;
        try {
            String query = "Select * from db_tubesPBO.barang where nama_barang like '"+nama+"%'";
            PreparedStatement ps = KonekDatabase.getConnection().prepareStatement(query);
            ResultSet rs  = ps.executeQuery();
            if (rs.next()) {
                stok = rs.getInt(3);
                id = rs.getString(1);
                if (qty > stok) {
                    JOptionPane.showMessageDialog(null, "Stok kurang");
                    val = 0;
                } else {
                    String update = "Update barang set stok_barang = ? where id_barang = " + id;
                    PreparedStatement ps1 = KonekDatabase.getConnection().prepareStatement(update);
                    int jml = stok - qty;
                    ps1.setString(1, String.valueOf(jml));
                    ps1.executeUpdate();
                    val = 1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       return val;
    }
    
    
    //nambahin untuk balikin stok ke semula misal batal dengan cara menambahkan stok lagi dengan satu dan akan di panggil ketika batal
}
