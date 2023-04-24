package BodyT;

public class BallT implements BodyT {
    private double radius;
    public BallT(double radius){
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
        if (obj instanceof BallT) {
            BallT other = (BallT) obj;
            return radius == other.radius;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Ball[radius=" + radius + "]";
    }
}

