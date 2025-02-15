package devdojo.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
//            boolean isDeleted = file.delete();
//            System.out.println(isDeleted);
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println("path " + file.getPath());
            System.out.println("absolute path " + file.getAbsolutePath());
            System.out.println("isDirectory " + file.isDirectory());
            System.out.println("isFile " + file.isFile());
            System.out.println("isHidden " + file.isHidden());
            System.out.println("lastModified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
