package Devices;

public class PC extends Device{
    private int numOfCores ;
    private int ram;

    public int getNumOfCores() {
        return numOfCores;
    }

    public void setNumOfCores(int numOfCores) {
        this.numOfCores = numOfCores;
    }

    public PC(String brand, int ram,int numOfCores,int price) {
        super(brand, price);
        this.numOfCores = numOfCores;
        this.ram = ram;

    }
    public String toString(){
        return getClass().getSimpleName() + ":" + this.getBrand()+"," + this.getRam() +"GB," + this.getNumOfCores()+"cores," + this.getPrice() + "lv";
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
