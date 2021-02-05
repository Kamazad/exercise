package Exercise_1_MZ.Ex28_Ex36;

public class Engine {
    private Double capacity;
    private Double horsePower;
    private Double fuelConsumption;

    public Engine(Double capacity, Double horsePower, Double fuelComsuption){
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelComsuption;
    }

    public void setCapacity (Double capacity){
        this.capacity = capacity;
    }

    public Double getCapacity(){
        return this.capacity;
    }

    public void setHorsePower (Double horsePower){
        this.horsePower = horsePower;
    }

    public Double getHorsePower(){
        return this.horsePower;
    }

    public void setFuelConsumption(Double fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }

    public Double getFuelConsumption (){
        return this.fuelConsumption;
    }
}
