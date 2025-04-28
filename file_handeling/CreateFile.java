
import java.io.File;

// package file_handeling;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            if (file.createNewFile()){
                System.out.println("file create:"+file.getName());
            }else{
                System.out.println("file already exists");
            }
        } catch (Exception e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
