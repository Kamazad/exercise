package Exercise_1_SDA.Ex11;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog(),
                new Cat(),
                new Cow()};
        for (Animal x : animals){
            x.makeSound();
        }
    }
}
