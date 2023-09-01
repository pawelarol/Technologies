import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseExample {
    public static void main(String[] args) throws Exception {

        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://127.0.0.1:5432/postgres";

       // org.postgresql.jdbc.PgConnection c;

        Connection con = DriverManager.getConnection(url, "postgres", "pawel2510");
        Statement stmt = con.createStatement();
        ResultSet rs  = stmt.executeQuery("SELECT * FROM builders");
        // ResultSet rs = stmt.executeQuery("SELECT \"id\", \"type_of_work\", \"meters \", \"saler\", \"adress \"n" +
         //       "\tFROM public.\"Builders \";");
        List<Contact> result = new ArrayList<>();

        while (rs.next()){
            Long contactid = rs.getLong("contactId");
            String typeOfWork = rs.getNString("typeOfWork");
            String meters = rs.getNString("meters");
            String saler = rs.getNString("saler");
            String adress = rs.getString("adress");

            Contact contact = new Contact(contactid,adress,typeOfWork,meters,saler);
            result.add(contact);
        }

        for (Contact cnt : result){
            System.out.println(cnt);
        }

    }
}
