package Catalogue;

import Devices.Device;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Catalogue {
    ArrayList<Device> devices = new ArrayList<>();
    public void addDevice(Device d1){

        devices.add(d1);
    }
    public void printall(){
        for (Device value : devices){
            System.out.println(value);
        }
    }

    Comparator<Device> byPrice = (Device d2, Device d1)
    -> Integer.compare(d2.getPrice(),d1.getPrice());
    Comparator<Device> byType = (Device dev1, Device dev2) ->
            dev1.getClass().getSimpleName().compareTo(dev2.getClass().getSimpleName());
    public void sort(){
        devices.sort(byPrice.thenComparing(byType).reversed());
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void availableBrands(Catalogue d1){
        ArrayList<String> brands = new ArrayList<>();
        for (Device d : devices){
            if(brands.contains(d.getBrand())){
                continue;
            }
            else {
                brands.add(d.getBrand());
            }
            }
        for (int i = 0; i < brands.size(); i++) {
            System.out.print(brands.get(i) + " ");
        }
        System.out.println();
        }
    }




