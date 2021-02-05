package Exercise_1_MZ.Ex28_Ex36;

public class SportCar extends Car{

    public SportCar (String producer, String model, String color, int seatsNumber, Engine engine){
        super.producer =  producer;
        super.model = model;
        super.color = color;
        super.seatsNumber = seatsNumber;
        super.engine = engine;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", engine=" + engine +
                '}';
    }
}
