package devdojo.io.test;

import java.io.File;
import java.io.FileWriter;

public class FileWritterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file)) {
            fw.write("I'm just a regular, everyday, normal mother fucker...");
            fw.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
