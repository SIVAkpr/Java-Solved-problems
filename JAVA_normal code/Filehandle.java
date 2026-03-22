import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandle {
    public static void main(String[] args) {
        filecreated();
        // writeinfile();
        readfile();
        fileInf();
        delFile();
    }

    public static void filecreated() {
        System.out.println("1");
        try {
            File myobj = new File("File1.txt");
            if (myobj.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occur");
            e.printStackTrace();
        }
    }

    public static void writeinfile() {
        System.out.println("2");
        try {
            File obj = new File("File2.txt");
            FileWriter w = new FileWriter(obj);
            w.write("Hello, its me java");
            w.close();
            System.out.println("Sucessfully wrote");
        } catch (IOException e) {
            System.out.println("Some error occurs");
            e.printStackTrace();
        }
    }

    public static void readfile() {
        try {
            File myobj = new File("File2.txt");
            Scanner r = new Scanner(myobj);
            while (r.hasNextLine()) {
                String data = r.nextLine();
                System.out.println(data);
            }
            r.close();
        } catch (IOException e) {
            System.out.println("Some error occurs");
            e.printStackTrace();
        }
    }

    public static void fileInf() {
        File myobj = new File("File2.txt");
        if (myobj.exists()) {
            System.out.println("File name -->" + myobj.getName());
            System.out.println("Absolute path -->" + myobj.getAbsolutePath());
            System.out.println("Writeable -->" + myobj.canWrite());
            System.out.println("Readable -->" + myobj.canRead());
            System.out.println("File size(bytes) --> " + myobj.length());
        } else {
            System.out.println("The file doesn't exists");
        }
    }

    public static void delFile() {
        File obj = new File("File1.txt");
        if (obj.delete())
            System.out.println("Deleted file : " + obj.getName());
        else
            System.out.println("Failed to deleted the file");
    }

}
