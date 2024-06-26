package day36_polymorphism;

import java.util.Arrays;

public class Iphone {

    private String brand, model, size, color;
    private double price;

    public Iphone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink", "Blue", "Red", "Gray"};
        if (Arrays.asList(colors).contains(color)) {
            this.color = color;
        } else {
            System.err.println("Invalid color: " + color + "\n color of the can only be : " + Arrays.toString(colors));
            System.exit(1);
        }

    }

    public void call(long phoneNumber) {
        System.out.println(getModel() + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(getModel() + " is texting to " + phoneNumber);
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Iphone)) { // bu kullanımın tercih edilmesinin sebebi yani else olarak değilde if olarak ayrı yazılmasının sebebi tüm diğer iflere bakmadan ilk ifden direkt uymuyorsa programı sonlandırmak.
            System.err.println("Invalid object, Object must be Iphone");
            System.exit(1);
        } // if the given object is not Iphone

        if (model.equals(((Iphone) obj).model)) { // if the model of the Iphone is equal to the given Iphone model
          /*  if (color.equals(((Iphone) obj).color)) { // if the color of the Iphone is equal to the given Iphone color
            }
           */
            return true;
        }
        return false;
    }
}