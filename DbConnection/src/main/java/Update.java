import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    public static void main(String[] args) {
        String updateSQL = "Update products SET price = ? where product_name = ?";
        PostgreDbConnection dbConnection = new PostgreDbConnection();
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement updateStatement = connection.prepareStatement(updateSQL)) {
             updateStatement.setDouble(1,20.00);
             updateStatement.setString(2,"Chais");
             int affectedRows = updateStatement.executeUpdate();
            System.out.println("UPDATE işleminden etkilenen satır sayısı : " + affectedRows);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
