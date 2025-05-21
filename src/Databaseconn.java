
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseconn {
   
    public static Connection func1() throws ClassNotFoundException, SQLException{
    { Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=Wholesale;user=wholesaler;password=78951";
    Connection func1=DriverManager.getConnection(connectionURL);
    return func1;
}}}
///DESKTOP-1TN5F77  localhost:1433 user=wholesaler;password=78951