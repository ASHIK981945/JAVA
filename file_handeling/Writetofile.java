
import java.io.FileWriter;

// package file_handeling;

public class Writetofile {
  public static void main(String[] args) {
      try {
        FileWriter writer  = new FileWriter("example.txt"); 
        writer.write("hello java is programming language");
        writer.close();
        System.out.println("Successfully write  to file:");
          
      } catch (Exception e) {
        System.out.println("AN error occurred ");
        e.printStackTrace();
      }
  }  
}
