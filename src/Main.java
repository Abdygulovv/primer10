public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        Box box2 = new Box(5, 10, 15);

        Box sumBox = box1.addBoxes(box2);

        System.out.println("Box 1 volume: " + box1.getVolume());
        System.out.println("Box 2 volume: " + box2.getVolume());
        System.out.println("Sum box volume: " + sumBox.getVolume());

        Box bigBox = new Box(box1, box2);

        System.out.println("Big box volume: " + bigBox.getVolume());
    }
}