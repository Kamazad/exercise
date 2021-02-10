package Exercise_3_SDA.Ex1_to_Ex10;

public class Dog implements Animals{
    //4.
    public String name;

    public Dog(String name){
        this.name = name;
    }

    public void makeSound (){
        System.out.println(this.name + " Hauuu");
    }

    @Override
    public String getName(){
        return this.getName();
    }
}
