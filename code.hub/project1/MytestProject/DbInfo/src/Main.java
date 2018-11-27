import java.sql.*;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in); //so as to select insert,update,delete
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;


        try {
            // connect to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", "root", "aekara21");

            System.out.println("Database connection successful!\n");

            // Create a statement
            myStmt = myConn.createStatement();

            //Insert values(id is set to Auto increment so no need to add value):
            System.out.println("Gimme me a number: 1 to Insert some predefined data:");
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                System.out.println("I am inserting successfully ");
                int newValues = myStmt.executeUpdate("insert into dbproject1.car_plate_data" +
                        "(FullName,PlateNumber,CarModel,ExpirationDatestamp)" +
                        "values " + "('Akis Pap','ABC-1243', 'Mercedes','12-aug-2202')");
            }

            // Execute SQL query
            myRs = myStmt.executeQuery("SELECT * FROM dbproject1.car_plate_data;");


            // Process result set
            while (myRs.next()) {
                System.out.println(myRs.getString("FullName") + ", " + myRs.getString("PlateNumber"));
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (myRs != null) {
                myRs.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }
    }
}



