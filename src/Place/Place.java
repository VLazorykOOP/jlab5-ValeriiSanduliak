package Place;

public abstract class Place implements Comparable<Place> {
    private String name;
    private int population;

    public Place(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPopulation: " + population;
    }

    @Override
    public int compareTo(Place place) {
        return getName().compareTo(place.getName());
    }
}
