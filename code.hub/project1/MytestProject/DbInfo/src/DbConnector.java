import java.sql.*;
import java.util.InputMismatchException;
//import java.util.Scanner;

public class DbConnector {

    public void dbcall() throws SQLException {
  //      Scanner scanner = new Scanner(System.in); //so as to select insert,update,delete
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;


        try {
            // connect to database- change password/username as per ur pc
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", "root", "aekara21");

            System.out.println("Database connection successful!\n");

            // Create a statement
            myStmt = myConn.createStatement();

            //Insert values(id is set to Auto increment so no need to add value):
          //  System.out.println("Gimme me a number: 1 to Insert some predefined data(or press anything else to continue):");
     //       try {
    //            int userInput = scanner.nextInt();
      //          if (userInput == 1) {
                    // System.out.println("I am inserting successfully ");
        //            int newValues = myStmt.executeUpdate("insert into dbproject1.car_plate_data" +
            //                "(FullName,PlateNumber,CarModel,ExpirationDatestamp)" +
              //              "values " + "('Akis Pap','ABC-1243', 'Mercedes','12-aug-2202')");
       //         }
       //     }catch (InputMismatchException exception) {System.out.println("Wrong Input.. I'll display all the db's records regarding\nFullname, Car Plate");}

            // Execute SQL query
            myRs = myStmt.executeQuery("SELECT * FROM dbproject1.car_plate_data;");


            // Process result set
            while (myRs.next()) {
                System.out.println(myRs.getString("FullName") + ", " + myRs.getString("PlateNumber")+", " + myRs.getString("ExpirationDatestamp"));
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
