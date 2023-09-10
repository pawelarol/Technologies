import java.sql.*;

public class InsertDatabase {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Contact contact = new Contact(6,"ustronna","jodla","150","Evelina");
        insert(contact);
    }
    private static void insert(Contact contact) {
        String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=public";

        try {
            Connection con = DriverManager.getConnection(url, "postgres", "pawel2510");
            PreparedStatement stmt = null;

            try {
                stmt = con.prepareStatement("INSERT INTO builders" +
                        "(contact_id, type_of_work, meters, saler, adress) values (?,?,?,?,?)");
                 stmt.setInt(1, contact.getContact_id());
                stmt.setString(2, contact.getType_Of_Work());
                stmt.setString(3, contact.getMeters());
                stmt.setString(4, contact.getSaler());
                stmt.setString(5, contact.getAdress());
                stmt.executeUpdate();
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
