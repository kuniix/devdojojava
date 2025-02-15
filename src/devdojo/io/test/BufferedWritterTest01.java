package devdojo.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWritterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file)) {
            BufferedWriter br = new BufferedWriter(fw);
            br.write("I'm just a regular, everyday, normal mother fucker...");
            br.newLine();
            br.write("I told in the first, i'll tell you in another");
            br.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
