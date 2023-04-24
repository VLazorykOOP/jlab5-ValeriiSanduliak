package Body;

public class Ball extends Body {
    private double radius;
    public Ball(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4.0 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
       return (4.0 * Math.PI * radius * radius * radius) / 3.0;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ball) {
            Ball other = (Ball) obj;
            return radius == other.radius;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Ball[radius=" + radius + "]";
    }
}
