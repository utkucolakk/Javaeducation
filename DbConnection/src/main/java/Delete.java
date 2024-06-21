import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.Scanner;

public class Delete {

    public static void main(String[] args) {
        Delete delete = new Delete();
        int customerID = delete.getWillDeleteCustomerId();
        String deleteSQL = "DELETE FROM customers WHERE customer_id = ?";
        PostgreDbConnection dbConnection = new PostgreDbConnection();
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement deleteStatement = connection.prepareStatement(deleteSQL)) {
            deleteStatement.setInt(1, customerID);
            int affectedRow = deleteStatement.executeUpdate();
            System.out.println("DELETE işlemi sonucunda etkilenen satır sayısı : " + affectedRow);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public int getWillDeleteCustomerId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silinmesini istediğiniz customer_id giriniz : ");
        return scanner.nextInt();
    }
}
