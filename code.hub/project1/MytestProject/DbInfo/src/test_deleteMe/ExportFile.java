package test_deleteMe;

import java.io.FileWriter;

public class ExportFile {

    //create a file
    public void writeToCsvDb(String fileName, String text) throws Exception {
        FileWriter writer = new FileWriter(fileName);
        writer.write(text.replaceAll("\\[", "").replaceAll("\\]",""));
        writer.close();
    }

    //add extra text
    public void appendToCsvDb(String fileName, String text) throws Exception {
        FileWriter writer = new FileWriter(fileName, true);
        writer.write("\n"+text.replaceAll("\\[", "").replaceAll("\\]",""));
        writer.close();
    }
}