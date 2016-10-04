import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class SimpleDb {

    public static void main(String[] args) {
        SimpleDb m = new SimpleDb();
        m.testDatabase();
    }

    private void testDatabase() {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/BD";
            String login = "postgres";
            String password = "6617074ft";
            Connection con = DriverManager.getConnection(url, login, password);

            try {
                Object f = con.getClass().getCanonicalName();

                System.out.println(f);
//                for (Method x: (Method[]) f
//                        ) {
//                    System.out.println("1");
//                    System.out.println(x);
//                }

            } catch (SecurityException e) {
                e.printStackTrace();
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
            }


            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM JC_CONTACT");
                while (rs.next()) {
                    String str = rs.getString("contact_id")
                            + " : " + rs.getString(2)
                            + " : " + rs.getString(3)
                            + " : " + rs.getString(4)
                            + " : " + rs.getString(5);
                    System.out.println("Contact_" + str);
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }






    }

}
