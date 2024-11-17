package bank.management.system;
import java.sql.*;

public class conn {
    Connection connection;
    Statement statement;

    public conn(){
        try{
            // Establish a connection to the MySQL database using the JDBC DriverManager
            connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem","root","Tarak@1402");
            // Create a Statement object to execute SQL queries on the established connection
            statement = connection.createStatement();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
