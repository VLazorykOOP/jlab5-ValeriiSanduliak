package Place;

public class City extends Place implements Comparable<Place> {
    private int streetCount;

    public City(String name, int population, int streetCount) {
        super(name, population);
        this.streetCount = streetCount;
    }

    @Override
    public String toString() {
        return "City info:\n" + super.toString() + "\nStreet Count: " + streetCount;
    }
}
