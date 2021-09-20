class Scratch {
    public static void main(String[] args) {

        Car volvo = new Car();
        volvo.setFuelEfficiency(10);
        volvo.addGas(20);
        volvo.drive(100);
        volvo.getGasLevel();
    }
}

class Car{

    private int fuelEfficiency;
    int gasInTank = 0;


    public void setFuelEfficiency(int eff){
        fuelEfficiency = eff;
    }
    public int getFuelEfficiency(){
        return fuelEfficiency;
    }
    public void addGas(int gas){
        gasInTank += gas;
    }
    public void getGasLevel(){
        System.out.println(this.gasInTank);
    }

    public void drive(int distance){
        int sum = distance / fuelEfficiency;
        gasInTank -= sum;
    }
}

