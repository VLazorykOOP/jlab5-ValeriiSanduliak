import Place.City;
import Place.Megapolis;
import Place.Place;
import Place.Region;

import java.io.*;
import java.util.*;

public class Task1 {
    public static void task1() {
        List<Region> regions = readRegionFromFile();
        List<City> cities = readCityFromFile();
        List<Megapolis> megapolis = readMegapolisFromFile();
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
        addPlaces(regions, cities, megapolis);
        Collections.sort(regions);
        Collections.sort(cities);
        Collections.sort(megapolis);
        System.out.println("\nPlaces after add new place and sort by name : \n");
        for (Region r : regions) {
            System.out.println(r + "\n------------------");
        }
        for (City c : cities) {
            System.out.println(c + "\n------------------");
        }
        for (Megapolis m : megapolis) {
            System.out.println(m + "\n------------------");
        }
        List<Place> places = new ArrayList<>();
        places.addAll(cities);
        places.addAll(regions);
        places.addAll(megapolis);
        Collections.sort(places);
        for (Place p : places) {
            System.out.println(p + "\n------------------");
        }
        Comparator<Place> comparator = Comparator.comparing(Place::getName);
        Collections.sort(places, comparator);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Education\\2-course\\Java\\jlab5-ValeriiSanduliak\\files\\Place\\output.txt"))) {
            for (Place place : places) {
                bw.write(place + "\n------------------");
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }

    static List<Region> readRegionFromFile() {
        List<Region> regions = new ArrayList<>();
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

    static List<City> readCityFromFile() {
        List<City> cities = new ArrayList<>();
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

    static List<Megapolis> readMegapolisFromFile() {
        List<Megapolis> megapolis = new ArrayList<>();
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

    static void addPlaces(List<Region> regions, List<City> cities, List<Megapolis> megapolises) {
        Scanner scanner = new Scanner(System.in);
        int ch = 1;
        while (ch != 4) {
            System.out.println("Choose a class to add a record:");
            System.out.println("1. Region");
            System.out.println("2. City");
            System.out.println("3. Megapolis");
            System.out.println("4. Exit");
            System.out.print("Select option <<< ");
            ch = scanner.nextInt();
            scanner.nextLine();
            switch (ch) {
                case 1:
                    System.out.print("Enter region name: ");
                    String regionName = scanner.nextLine();
                    System.out.print("Enter region population: ");
                    int regionPopulation = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter region country: ");
                    String regionCountry = scanner.nextLine();
                    Region region = new Region(regionName, regionCountry, regionPopulation);
                    regions.add(region);
                    break;
                case 2:
                    System.out.print("Enter city name: ");
                    String cityName = scanner.nextLine();
                    System.out.print("Enter city population: ");
                    int cityPopulation = scanner.nextInt();
                    System.out.print("Enter street count: ");
                    int streetCount = scanner.nextInt();
                    City city = new City(cityName, cityPopulation, streetCount);
                    cities.add(city);
                    break;
                case 3:
                    System.out.print("Enter megapolis name: ");
                    String megapolisName = scanner.nextLine();
                    System.out.print("Enter megapolis population: ");
                    int megapolisPopulation = scanner.nextInt();
                    System.out.print("Enter airport count: ");
                    int airportCount = scanner.nextInt();
                    System.out.print("Enter park count: ");
                    int parkCount = scanner.nextInt();
                    Megapolis megapolis = new Megapolis(megapolisName, megapolisPopulation, airportCount, parkCount);
                    megapolises.add(megapolis);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option selected. Please try again.");
            }
        }
    }


}
