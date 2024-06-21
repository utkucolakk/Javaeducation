import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    public static void main(String[] args) {

        PostgreDbConnection dbConnection = new PostgreDbConnection();
        String insertSQL = "INSERT INTO customers (customer_id, customer_name, contact_name, address, city, postal_code, country) VALUES (?, ?, ?, ?, ?, ?, ?)";
        //veritabanı bağlantı oluşturma
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement insertStatement = connection.prepareStatement(insertSQL)) {  //try-with-resource
            /*
            INSERT INTO customers (customer_id, customer_name, contact_name, address, city, postal_code, country) VALUES (998, 'a', 'b', 'c', 'd', 'e', 'f')
             */
            // INSERT
            insertStatement.setInt(1, 999);
            insertStatement.setString(2, "utku");
            insertStatement.setString(3, "suc");
            insertStatement.setString(4, "etimesgut");
            insertStatement.setString(5, "ankara");
            insertStatement.setString(6, "123");
            insertStatement.setString(7, "TR");
            int affectedRow = insertStatement.executeUpdate();
            System.out.println("INSERT işlemi başarılı toplamda insert adedi : " + affectedRow);
            System.out.println();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
