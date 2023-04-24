package Body;

public abstract class Body implements Comparable<Body> {
    public abstract double area();

    public abstract double volume();

    public abstract String toString();

    @Override
    public int compareTo(Body other) {
        double diff = this.volume() - other.volume();
        if (diff == 0) {
            return 0;
        } else if (diff > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
