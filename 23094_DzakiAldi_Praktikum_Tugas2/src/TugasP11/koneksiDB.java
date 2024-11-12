
package TugasP11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksiDB {
    private static Connection cnct;

    public static Connection cnct() throws SQLException, ClassNotFoundException {
        try {
            if (cnct == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                cnct = DriverManager.getConnection("jdbc:mysql://localhost:3306/database3d", "root", "12324");
                System.out.println("Koneksi berhasil!");
            }
            return cnct;
        } catch (SQLException e) {
            System.err.println("Error: Koneksi tidak berhasil! " + e.getMessage());
            throw e;
        }
    }
}
