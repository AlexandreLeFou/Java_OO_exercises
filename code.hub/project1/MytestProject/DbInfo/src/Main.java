import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DbConnector myDatabase = new DbConnector();
        try {
            myDatabase.dbcall();
        } catch (SQLException e) {
            System.out.println("Something went wrong please retry and check out the db and/or csv file");
            e.printStackTrace();
        }
    }
}



