public class Box {
    private int length;
    private int width;
    private int height;



    public Box(Box box1, Box box2) {
        Box sumBox = box1.addBoxes(box2);
        int volumeSum = box1.getVolume() + box2.getVolume();

        while (sumBox.getVolume() < volumeSum) {
            sumBox = sumBox.addBoxes(sumBox);
        }

        this.length = sumBox.length;
        this.width = sumBox.width;
        this.height = sumBox.height;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    
    public Box addBoxes(Box otherBox) {
        int newLength = this.length + otherBox.length;
        int newWidth = this.width + otherBox.width;
        int newHeight = this.height + otherBox.height;

        return new Box(newLength, newWidth, newHeight);
    }

    public int getVolume() {
        return this.length * this.width * this.height;
    }

}
