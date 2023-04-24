import Place.*;
import Body.*;
import BodyT.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task1 {
    static ArrayList<Region> readRegionFromFile() {
        ArrayList<Region> regions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Education\\2-course\\Java\\jlab5-ValeriiSanduliak\\files\\Place\\Region.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                String country = data[1];
                int population = Integer.parseInt(data[2]);
                Region region = new Region(name, country, population);
                regions.add(region);
            }
        } catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }
        return regions;
    }

    static ArrayList<City> readCityFromFile() {
        ArrayList<City> cities = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Education\\2-course\\Java\\jlab5-ValeriiSanduliak\\files\\Place\\City.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                int population = Integer.parseInt(data[1]);
                int streetCount = Integer.parseInt(data[2]);
                City city = new City(name, population, streetCount);
                cities.add(city);
            }
        } catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }
        return cities;
    }

    static ArrayList<Megapolis> readMegapolisFromFile() {
        ArrayList<Megapolis> megapolis = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Education\\2-course\\Java\\jlab5-ValeriiSanduliak\\files\\Place\\Megapolis.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                int population = Integer.parseInt(data[1]);
                int airportCount = Integer.parseInt(data[2]);
                int parkCount = Integer.parseInt(data[3]);
                Megapolis megapolisr = new Megapolis(name, population, airportCount, parkCount);
                megapolis.add(megapolisr);
            }
        } catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }
        return megapolis;
    }

    public static void task1() {
        ArrayList<Region> regions = readRegionFromFile();
        ArrayList<City> cities = readCityFromFile();
        ArrayList<Megapolis> megapolis = readMegapolisFromFile();
        for (Region r : regions) {
            System.out.println(r + "\n------------------");
        }
        for (City c : cities) {
            System.out.println(c + "\n------------------");
        }
        for (Megapolis m : megapolis) {
            System.out.println(m + "\n------------------");
        }
        Collections.sort(regions);
        Collections.sort(cities);
        Collections.sort(megapolis);
        System.out.println("\nPlaces after sort by name : \n");
        for (Region r : regions) {
            System.out.println(r + "\n------------------");
        }
        for (City c : cities) {
            System.out.println(c + "\n------------------");
        }
        for (Megapolis m : megapolis) {
            System.out.println(m + "\n------------------");
        }

    }
}
