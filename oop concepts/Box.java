public class Box {
    double height, width, depth;

    Box(double height, double width, double depth) {
        this.height = height; // ? hiding instance variable using this keyword
        this.width = width;
        this.depth = depth;
        displayVol();
    }

    void displayVol() {
        double volume = height * width * depth;
        System.out.println("Volume: " + volume);
    }

    public static void main(String[] args) {
        new Box(10, 10, 10);
        new Box(20, 30, 10);
    }
}
