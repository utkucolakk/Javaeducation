import java.sql.*;

public class Select {

    public static void main(String[] args) {
        PostgreDbConnection dbConnection = new PostgreDbConnection();
        try(Connection connection = dbConnection.getConnection();
        ) {
            //veritabanı bağlantı oluşturma

                // SELECT İşlemi
            String selectSQL = "SELECT * FROM customers";
            PreparedStatement selectStatement = connection.prepareStatement(selectSQL);
            ResultSet resultSet = selectStatement.executeQuery(); // SELECT
            while (resultSet.next()) {
                // Db' den gelen sonuçları al
                int customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                String country = resultSet.getString("country");
                String postal_code = resultSet.getString("postal_code");

                System.out.println("customer_id : " + customerId);
                System.out.println("customer_name : " + customerName);
                System.out.println("country : " + country);
                System.out.println("postal_code : " + postal_code);
                System.out.println();

            }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }

