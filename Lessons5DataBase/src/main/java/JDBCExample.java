import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {
    public static void main(String[] args) throws Exception{
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://127.0.0.1:5432/postgres";

        Connection con = DriverManager.getConnection(url, "postgres", "pawel2510");
        System.out.println(con.getClass().getCanonicalName());

    }
}
