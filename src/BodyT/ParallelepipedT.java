package BodyT;

public class ParallelepipedT implements BodyT {
    private double length;
    private double width;
    private double height;
    public ParallelepipedT(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return 2*(length*width + width*height + height*length);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ParallelepipedT) {
            ParallelepipedT other = (ParallelepipedT) obj;
            return length == other.length && width == other.width && height == other.height;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Parallelepiped[length=" + length + ",width=" + width + ",height=" + height + "]";
    }
}
