import java.util.Random;

class Scratch {
    public static void main(String[] args) {
        Random r = new Random();

        Area squares[] = new Area[4];
        Area circle[] = new Area[5];
        Area rectangles[] = new Area[4];
        System.out.println("squares");
        for (int i = 0; i< squares.length; i++){
            squares[i] = new Area();
            squares[i].squareArea(r.nextInt(100));
        }
        System.out.println("circles");
        for (int i = 0; i< circle.length; i++){
            circle[i] = new Area();
            circle[i].circleArea(r.nextInt(50));
        }
        System.out.println("rectangles");
        for (int i = 0; i< rectangles.length; i++){
            rectangles[i] = new Area();
            rectangles[i].rectangleArea(r.nextInt(100), r.nextInt(200));
        }
    }
}


abstract class Shapes{
    public abstract void rectangleArea(int length, int breadth);
    public abstract void squareArea(int side);
    public abstract void circleArea(int radius);
}
class Area extends Shapes{
    double PI = 3.14;
    @Override
    public void rectangleArea(int length, int breadth) {
        System.out.println(length*breadth);
    }

    @Override
    public void circleArea(int radius) {
        System.out.println(radius*radius*PI);
    }

    @Override
    public void squareArea(int side) {
        System.out.println(side*4);
    }
}






abstract class Animals{
    public abstract void cats();
    public abstract void dogs();
}

class Cats extends Animals{
    @Override
    public void cats() {
        System.out.println("Cats meow");
    }

    @Override
    public void dogs() {

    }
}
class Dogs extends Animals{
    @Override
    public void dogs() {
        System.out.println("Dogs bark");
    }

    @Override
    public void cats() {

    }
}