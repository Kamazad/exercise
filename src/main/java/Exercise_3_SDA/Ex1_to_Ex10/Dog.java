package Exercise_3_SDA.Ex1;

public class Dog implements Animals{
    //4.
    public String nameOfDog;

    public Dog(String nameOfDog){
        this.nameOfDog = nameOfDog;
    }

    public void makeSound (){
        System.out.println(this.nameOfDog + " Hauuu");
    }
}
