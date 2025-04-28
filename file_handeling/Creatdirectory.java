
import java.io.File;
// package file_handeling;
public class Creatdirectory {
    public static void main(String[] args) {
        File  dir = new File ("myFolder");
        if(dir.mkdir()){
            System.out.println("Directory created!");
        } else {
            System.out.println("directory already exists!");
        }
    }
}
