import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Nikhilg");
        PreparedStatement ps=con.prepareStatement("insert into jdbc_table values(?,?,?)");
        ps.setString(1, "kubernetes");
        ps.setString(2, "learning");
        ps.setString(3, "youtube");
        int i=ps.executeUpdate();
        if (i>0) {
            System.out.println("table insert");
        }else{
            System.out.println("Give your inputs to insert");
        }

    }
}
