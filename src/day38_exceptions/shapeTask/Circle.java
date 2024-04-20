package day38_exceptions.shapeTask;

public class Circle {

    private double Radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            throw new InvalidShareException("Radius of the circle not be or zero "+ radius);
        }
        Radius = radius;
    }
}
