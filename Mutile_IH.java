
// ambibuity 

interface parent1 {
    void show();
}

interface parent2 {
    void show();
}

class child implements parent1, parent2 {

    public void show() {
        System.out.println("child details");
    }
}

public class Mutile_IH {
    public static void main(String[] args) {
        child c = new child();
        c.show();

    }
}

// thorw keyword