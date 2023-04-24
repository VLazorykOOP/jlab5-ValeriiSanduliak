package Place;

public class Megapolis extends Place implements Comparable<Place> {
    private int airportCount;
    private int parkCount;

    public Megapolis(String name, int population, int airportCount, int parkCount) {
        super(name, population);
        this.airportCount = airportCount;
        this.parkCount = parkCount;
    }

    @Override
    public String toString() {
        return "Megapolis info\n" + super.toString() + "\nAirport Count: " + airportCount + "\nPark Count: " + parkCount;
    }
}
