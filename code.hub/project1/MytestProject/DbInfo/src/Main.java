import test_deleteMe.ExportFile;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DbConnector myDatabase = new DbConnector();
        ExportFile fileExport = new ExportFile();

        try {
            myDatabase.dbcall();
            System.out.println("OLE OLE OLE "+myDatabase.columnFullName);
            System.out.println("OLE OLE OLE 2"+myDatabase.columnCarPlate);
            System.out.println("OLE OLE OLE 3"+myDatabase.columnDate);

            //fileExport.writeToCsvDb("exportFile2.csv",myDatabase.columnFullName.toString());
            //fileExport.appendToCsvDb("exportFile2.csv",myDatabase.columnDate.toString());


        } catch (Exception e) {
            System.out.println("Something went wrong please retry and check out the db and/or csv file");
            e.printStackTrace();
        }
    }
}



