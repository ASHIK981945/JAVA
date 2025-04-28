
import java.io.File;
import java.util.Scanner;

// package file_handeling;

public class Readfile {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
            String data = reader.nextLine();
            System.out.println(data);
            } 
            reader.close();
        } catch (Exception e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        }
    }
}
