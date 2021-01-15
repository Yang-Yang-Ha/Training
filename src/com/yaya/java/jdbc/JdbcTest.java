package jdbc;

/**
 *
 * @author Stephen
 */
public class JdbcTest {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("success");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
