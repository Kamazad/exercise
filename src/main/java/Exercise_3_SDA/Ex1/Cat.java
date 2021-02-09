package Exercise_3_SDA.Ex1;

public class Cat implements Animals{
    //1.
    private String nameOfCat;
    private int eatenMouse;

    public Cat (String nameOfCar){
        this.nameOfCat = nameOfCar;
        this.eatenMouse = 0;
    }

    public void makeSound(){
        System.out.println(this.nameOfCat + " Miauuuu");
    }
//3.
    public void eatMouse (){
        this.eatenMouse++;
    }

}
