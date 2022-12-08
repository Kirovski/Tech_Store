package Application;
import Catalogue.Catalogue;
import Devices.PC;
import Devices.Tablet;
import Devices.Phone;
import Utility.FileWriter;
import Utility.Statistics;
public class Main {
    public static void main(String[] args) {
        Tablet tablet1 = new Tablet("Lenovo", "Black", (float)25.4, 450);
        Phone phone1 = new Phone("Samsung", 4,2019,800);
        Phone phone3 = new Phone("Apple", 8,2021,1800);
        Tablet tablet2 = new Tablet("Lenovo", "White", (float)26.5, 1100);
        Tablet tablet3 = new Tablet("Samsung", "Gold", (float)23.6, 800);
        Phone phone2 = new Phone("LG", 4,2020,600);
        PC pc1 = new PC("HP",8,4,1100);
        PC pc2 = new PC("Alienware",32,16,3300);
        Catalogue items = new Catalogue();
        items.addDevice(phone2);
        items.addDevice(tablet1);
        items.addDevice(phone1);
        items.addDevice(phone3);
        items.addDevice(tablet2);
        items.addDevice(tablet3);
        items.addDevice(pc1);
        items.addDevice(pc2);
        System.out.println("AVAILABLE ITEMS IN STORE\n" +
                "-----------------------------");
        items.printall();
        System.out.println();
        items.sort();
        System.out.println("After Sorting by price and type\n"+
                        "-----------------------------");
        items.printall();
        System.out.println("-----------------------------");
        System.out.println("Type Tablet, Phone or PC, to check the statistics");
        Statistics stats = new Statistics();
        stats.statsForItemType(items);
        System.out.println("-----------------------------");
        System.out.println("Type any Brand, to check and save all available items from it\n" +
                "Available Brands:");
        items.availableBrands(items);
        FileWriter fr = new FileWriter();
        fr.writeToFileBrand(items);


    }
}
