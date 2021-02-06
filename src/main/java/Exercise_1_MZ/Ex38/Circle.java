package Exercise_1_MZ.Ex38;

public class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double countArea() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    public void displayArea() {
        System.out.println("Promień Koła wynosi : " + countArea());
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

}
