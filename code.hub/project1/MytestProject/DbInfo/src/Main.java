import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

            Connection myConn = null;
            Statement myStmt = null;
            ResultSet myRs = null;

            try {
                // connect to database
                myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", "root", "aekara21");

                System.out.println("Database connection successful!\n");

                // Create a statement
                myStmt = myConn.createStatement();

                // Execute SQL query
                myRs = myStmt.executeQuery("SELECT * FROM dbproject1.car_plate_data;");

                // Process result set
                while (myRs.next()) {
                    System.out.println(myRs.getString("FullName") + ", " + myRs.getString("PlateNumber"));
                }
            } catch (Exception exc) {
                exc.printStackTrace();
            } finally {
                if (myRs != null) { myRs.close();}

                if (myStmt != null) { myStmt.close();}

                if (myConn != null) {myConn.close();}
            }
        }
    }


