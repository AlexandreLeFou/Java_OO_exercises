import java.sql.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
//import java.util.Scanner;

public class DbConnector {
    //LinkedList<String> databaseInfos = new LinkedList<String>();
    List<String> columnFullName = new ArrayList<String>();
    List<String> columnCarPlate = new ArrayList<String>();
    List<String> columnDate = new ArrayList<String>();



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

            // Execute SQL query
            myRs = myStmt.executeQuery("SELECT * FROM dbproject1.car_plate_data;");


            // Process result set
            while (myRs.next()) {
                System.out.println(myRs.getString("FullName") + ", " + myRs.getString("PlateNumber")+", " + myRs.getString("ExpirationDatestamp"));
                columnFullName.add(myRs.getString("FullName"));
                columnCarPlate.add(myRs.getString("PlateNumber"));
                columnDate.add(myRs.getString("ExpirationDatestamp"));
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
