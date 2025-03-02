public class Cuboid {

    static int calculateVolume(int length, int width, int height) {
        return length * width * height;
    }

    public static void main(String[] args) {

        int length = 5;
        int width = 3;
        int height = 4;

        int volume = Cuboid.calculateVolume(length, width, height);

        System.out.println("The volume of the cuboid is: " + volume);
    }
}
