package Exercise_3_SDA.Ex11_to_Ex13;

public class Circle {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public Double getArea() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    public void willItBeEnoughPaint(Double area) {
        double temp = this.getArea(); //by nie liczy dwa razy getArea()
        if (area.doubleValue() <= temp) {
            System.out.println("Masz wystarczającą ilość farby by pomalować : " + temp + "więc jest OK");
        } else {
            System.out.println("Braknie ci farby");
        }
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
