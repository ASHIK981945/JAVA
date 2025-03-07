// parent class - shape(length, breadth , height)
// child class - cube(methode-volumeof cube())
// child class - cuboid(methode-volumeof ())

class Shape {
    void shapa() {
        System.out.println("find the shape of volume");
    }
}

class volume extends Shape {
    void cube(int l) {
        System.out.println("volume of cube:" + l * l * l);
    }

    void cuboid(int l, int b, int h) {
        System.out.println("volume of cuboid:" + l * b * h);
    }
}

public class Volumeinh {
    public static void main(String[] args) {
        Shape a = new Shape();
        a.shapa();
        volume b = new volume();
        b.cube(2);
        b.cuboid(2, 3, 4);
    }
}