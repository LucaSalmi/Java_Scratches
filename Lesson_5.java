class Scratch {
    public static void main(String[] args) {

        SodaCan coke = new SodaCan(10,5);
        SodaCan pepsi = new SodaCan(12,6);
        SodaCan zingo = new SodaCan(8,16);

        coke.printOut();
        System.out.println(coke.getSurfaceArea(coke.height, coke.radius));
        System.out.println(coke.getVolume(coke.height, coke.surface));

        pepsi.printOut();
        zingo.printOut();
    }
}


class SodaCan {
    int height;
    int radius;
    int surface;
    int volume;


    public SodaCan(int height, int radius){
        this.height = height;
        this.radius = radius;
    }

    public void printOut(){

        System.out.println("The height is: " + this.height);
        System.out.println("The radius is: " + this.radius);

    }

    public int getSurfaceArea(int height, int radius){

        double surface = (Math.PI * (2*Math.pow(radius, 2)));

        this.surface = (int) Math.round(surface);
        return (int) Math.round(surface);
    }

    public int getVolume(int height, int surface){
        int volume = height * surface;
        this.volume = volume;
        return  volume;

    }



}
