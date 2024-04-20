package day31_inheritance.shape_methodOverriding;

public class Circle extends Shape{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double area() {
        return radius * radius * 3.14;
    }

    public double perimeter() {
        return 2 * radius * 3.14;
    }

    @Override
    public void draw() {
        super.draw();
        setRadius(3);

        // Çemberi çizmek için iki döngü kullanılır
        for (double y = -radius; y <= radius; y++) {
            for (double x = -radius; x <= radius; x++) {
                // Çemberin denklemi: x^2 + y^2 = r^2
                if (x * x + y * y <= radius * radius) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                "radius='" + getRadius() + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
