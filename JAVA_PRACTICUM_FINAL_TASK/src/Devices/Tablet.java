package Devices;

public class Tablet extends Device{
    private String color;
    private float diagonal;


    public Tablet(String brand, String color, float diagonal, int price){
        super(brand, price);
        this.color = color;
        this.diagonal = diagonal;


    }
    public String toString(){
        return getClass().getSimpleName() +":" + this.getBrand()+","
                + this.color+"," + this.diagonal+"cm," + this.getPrice() + "lv";
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }
}//end of class

