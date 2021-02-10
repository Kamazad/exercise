package Exercise_3_SDA.Ex1_to_Ex10;

public class Cat implements Animals, Movable{
    //1.
    private String name;
    private int eatenMouse;

    public Cat (String name){
        this.name = name;
        this.eatenMouse = 0;
    }

    public void makeSound(){
        System.out.println(this.name + " Miauuuu");
    }
//3.
    public void eatMouse (){
        this.eatenMouse++;
    }

    @Override
    public void move(){
        System.out.println("idę");
    }

    @Override
    public String getName(){
        return this.name;
    }

}
