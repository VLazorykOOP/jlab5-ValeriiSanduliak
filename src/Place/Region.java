package Place;

public class Region extends Place implements Comparable<Place> {
    private String country;

    public Region(String name, String country, int population) {
        super(name, population);
        this.country = country;
    }

    @Override
    public String toString() {
        return "Region info:\n" + super.toString() + "\nCountry: " + country;
    }


}
