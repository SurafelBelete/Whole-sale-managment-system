
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBconn {
    public static void main(String[] args) {
        try {
            System.out.println("hello earthling   whts up");
            Databaseconn sth=new Databaseconn();
            System.out.println(Databaseconn.func1());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
