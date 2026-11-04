
package campingapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author nanda
 */
public class Koneksi {
    private Connection conn;
    public Connection connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_camping", "root", "");
            System.out.println("Koneksi berhasil!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi gagal: " + e);
        }
        return conn;
    }
    
    public static void main(String[] args){
        Koneksi k = new Koneksi();
        k.connect();
    }
}
