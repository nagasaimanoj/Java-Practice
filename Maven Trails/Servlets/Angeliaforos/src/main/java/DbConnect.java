import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
    private final static String dbUrl = "jdbc:mysql://localhost/angeliaforos";
    private final static String dbUser = "root";
    private final static String dbPass = "password";
    private final static String dbDriver = "com.mysql.jdbc.Driver";

    public static synchronized boolean runQuery(String query) throws IOException {
        boolean status = false;
        try {
            Class.forName(dbDriver);
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            status = (con.prepareStatement(query).executeUpdate() > 0);
            con.close();
        } catch (Exception ex) {
        }
        return status;
    }
}