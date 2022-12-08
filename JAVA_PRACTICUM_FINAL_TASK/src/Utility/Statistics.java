package Utility;

import Catalogue.Catalogue;
import Devices.Device;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class Statistics {
    float avgPrice = 0;
    int numOfItems1 = 0;
    ArrayList<Device> itemsChecked = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    String checkedtype = scanner.nextLine().toLowerCase(Locale.ROOT);
    public void statsForItemType(Catalogue catalogue) {
        for (Device d : catalogue.getDevices()) {
            if (d.getClass().getSimpleName().toLowerCase(Locale.ROOT).equals(checkedtype)){
                itemsChecked.add(d);
                numOfItems1++;
                avgPrice+=d.getPrice();
            }
        }
        System.out.println(itemsChecked);
        System.out.println("Number of items of this type: "+ +numOfItems1);
        System.out.println("Average price: " + avgPrice/numOfItems1+ " lv" );
        itemsChecked.sort(byPrice.reversed());
        System.out.println("Most expensive item: " + itemsChecked.get(0));
    }
    Comparator<Device> byPrice = (Device d1, Device d2)
            -> Integer.compare(d1.getPrice(),d2.getPrice());



}
