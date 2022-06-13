package Database;

/**
 *
 * @author mac
 */
public class sessionLogin {
    private static String uname;
    private static int id;
    private static String nama;
    private static String alamat;
    private static String nohp;
    private static String jeniskelamin;
    private static String tgllahir;
    
    //setuname
    public static String get_uname(){
        return uname;
    }
    
    public static void set_uname(String uname){
        sessionLogin.uname = uname;
    }
    
    //set id
    public static int get_id(){
        return id;
    }
    
    public static void set_id(int id){
        sessionLogin.id = id;
    }
    
    //set name
    public static String get_name(){
        return nama;
    }
    
    public static void set_name(String nama){
        sessionLogin.nama = nama;
    }
    
    //set alamat
    public static String get_alamat(){
        return alamat;
    }
    
    public static void set_alamat(String alamat){
        sessionLogin.alamat = alamat;
    }
    
    //set no hp
    public static String get_nohp(){
        return nohp;
    }
    
    public static void set_nohp(String nohp){
        sessionLogin.nohp = nohp;
    }
    
    //set jenis kelamin
    public static String get_jeniskelamin(){
        return jeniskelamin;
    }
    
    public static void set_jeniskelamin(String jeniskelamin){
        sessionLogin.jeniskelamin = jeniskelamin;
    }
    
    //set tgl lahir
    public static String get_tgllahir(){
        return tgllahir;
    }
    
    public static void set_tgllahir(String tgllahir){
        sessionLogin.tgllahir = tgllahir;
    }
}
