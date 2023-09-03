import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseExample {
    public static void main(String[] args) throws Exception {

        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/Example?currentSchema=public";

        // org.postgresql.jdbc.PgConnection c;

        Connection con = DriverManager.getConnection(url, "postgres", "pawel2510");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT id_contact, name_contact, gender, city FROM first");
        List<Person> result = new ArrayList<>();

        while (rs.next()) {
            Long id = rs.getLong("id_contact");
            String name = rs.getString("name_contact");
            String gender = rs.getString("gender");
            String city = rs.getString("city");

            Person person = new Person(id,name,gender,city);
            result.add(person);
        }

        for (Person p : result) {
            System.out.println(p);
        }


    }
}
