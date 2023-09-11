import org.postgresql.core.SqlCommand;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseExample {
    public static void main(String[] args) throws Exception {
        List<Person> result = new ArrayList<>();
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/Example?currentSchema=public";

        // org.postgresql.jdbc.PgConnection c;
        Connection con = DriverManager.getConnection(url, "postgres", "pawel2510");
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM first");

            while (rs.next()) {
                Long id = rs.getLong("id_contact");
                String name = rs.getString("name_contact");
                String gender = rs.getString("gender");
                String city = rs.getString("city");

                Person person = new Person(id, name, gender, city);
                result.add(person);
                for(Person p : result){
                    System.out.println(p);
                }
            }
        } finally {
            if (rs != null) {
                closeRs(rs);
            }
            if (stmt != null) {
                closeStmt(stmt);
            }
            con.close();
        }


    }

    public static void closeRs(ResultSet rs) throws SQLException {
        rs.close();
    }
    public static void closeStmt(Statement stmt ) throws SQLException {
        stmt.close();
    }



}


