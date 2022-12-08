package Utility;
import Catalogue.Catalogue;
import Devices.Device;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class FileWriter {
    ArrayList<Device> itemsOfTheSavedBrand = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String checkedBrandByUser = scanner.nextLine().toLowerCase(Locale.ROOT);

    public void writeToFileBrand(Catalogue catalogue) {
        for (Device d : catalogue.getDevices()) {
            if (d.getBrand().toLowerCase(Locale.ROOT).equals(checkedBrandByUser)) {
                itemsOfTheSavedBrand.add(d);
            }
        }
        try(BufferedWriter bw = Files.newBufferedWriter(Paths.get("C:\\Users\\User\\IdeaProjects\\JAVA_PRACTICUM_FINAL_TASK\\listofitems.txt"))) {
            for ( Device d : itemsOfTheSavedBrand){
                bw.write(d.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } ;
        System.out.println("Saved items in file");
        System.out.println(itemsOfTheSavedBrand);
        int counter = 0;
        for (Device d1 : itemsOfTheSavedBrand){
            if ( d1.getClass().getSimpleName().equals(itemsOfTheSavedBrand.get(0).getClass().getSimpleName())){
                counter++;

            }

        }
        if (counter == itemsOfTheSavedBrand.size()){
            System.out.println("Same type");
        }
        else {
            System.out.println("Different Types");
        }
    }
}
