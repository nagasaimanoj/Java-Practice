import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DbConnect {
    private final static String dbUrl = "jdbc:mysql://localhost/angeliaforos";
    private final static String dbUser = "root";
    private final static String dbPass = "password";
    private final static String dbDriver = "com.mysql.jdbc.Driver";
    private static Connection conn = null;
    private static DbConnect thisObj = new DbConnect();

    private DbConnect() {}

    public static DbConnect getInstance() {return thisObj;}

    public static synchronized Connection getConnection() throws IOException, SQLException {
        try {
            Class.forName(dbDriver);
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        } catch (Exception ex) {}
        return conn;
    }

    public static synchronized boolean runQuery(String query) throws IOException, SQLException {
        boolean isSuccess = false;
        try {
            isSuccess = (getConnection().prepareStatement(query).executeUpdate() > 0);
            getConnection().close();
        } catch (Exception ex) {}
        return isSuccess;
    }

    public static synchronized boolean userValidate(String username, String password) throws SQLException, IOException {
        boolean isValid = false;
        Statement stmt = getConnection().createStatement();
        ResultSet resultSet = stmt.executeQuery("Select * from user_table where user  = ''" + username + "';");

        if (resultSet.next()) {
            isValid = password == resultSet.getString(2);
        }

        return isValid;
    }
}