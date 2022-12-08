package Devices;

public class Phone extends Device{
    private int cameras;
    private int yearOfManifacturing;
    public Phone(String brand, int cameras, int yearOfManifacturing, int price){
        super(brand, price);
        this.cameras = cameras;
        this.yearOfManifacturing = yearOfManifacturing;
    }
    public String toString(){
        return getClass().getSimpleName() +":" + this.getBrand() +"," + this.cameras+"cam." +","
                + this.yearOfManifacturing +"," + this.getPrice()+"lv";
    }
    public int getCameras() {
        return cameras;
    }

    public void setCameras(int cameras) {
        this.cameras = cameras;
    }

    public int getYearOfManifacturing() {
        return yearOfManifacturing;
    }

    public void setYearOfManifacturing(int yearOfManifacturing) {
        this.yearOfManifacturing = yearOfManifacturing;
    }
}//end of class
