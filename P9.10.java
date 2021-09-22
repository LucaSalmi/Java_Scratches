import java.awt.Rectangle;

class Scratch {
    public static void main(String[] args) {
        BetterRectangle a = new BetterRectangle(1,1,25,15);

        System.out.println(a.getPerimeter());
        System.out.println(a.getArea());


    }
}

class BetterRectangle extends Rectangle{

    public BetterRectangle(int x, int y, int width, int height){

        super.setLocation(x,y);
        super.setSize(width, height);

        //setLocation(x, y);
        //setSize(width, height);
    }


    public int getPerimeter(){
        int perimeter = 2* (width + height);
        return perimeter;
    }

    public int getArea(){

        int area = width * height;
        return area;
    }
}
