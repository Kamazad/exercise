package Exercise_3_SDA.Ex11_to_Ex13;

public class Triangle {
    private Double height;
    private Double base;

    public Triangle (Double height, Double base){
        this.height = height;
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getArea(){
        return (this.height * this.base);
    }

    public void willItBeEnoughPaint(Double area) {
        double temp = this.getArea(); //by nie liczy dwa razy getArea()
        if (area.doubleValue() <= temp) {
            System.out.println("Masz wystarczającą ilość farby by pomalować : " + temp + "więc jest OK");
        } else {
            System.out.println("Braknie ci farby");
        }
    }
}
