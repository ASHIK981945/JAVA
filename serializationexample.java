import java.io.FileOutputStream;
import serialization.Student;
import java.io.ObjectOutputStream;

public  class serializationexample {

    public static void main(String[] args) {
        try {
          Student student=new Student(4,"Ashik");
          FileOutputStream fileoutput=new FileOutputStream("student.ser");
          ObjectOutputStream obj=new ObjectOutputStream(fileoutput);

          obj.writeObject(student);
          obj.close();
          fileoutput.close();
          System.out.println("Serialization completed!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}