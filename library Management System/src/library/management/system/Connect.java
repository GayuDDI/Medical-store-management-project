package library.management.system;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {
    public static Connection Connection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Corrected URL (removed the extra "/")
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "@rdgadmin");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
