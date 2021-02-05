package Exercise_1_MZ.Ex37;

public class Rectangle extends Figure {

    //Skoro nie ma getterów i setterów to te pola mogą być finalne
    private final float sideA;
    private final float sideB;

    //Override nie musi tu być
    @Override
    public float countArea() {
        return (this.sideA * this.sideB);
    }


    //Override nie musi tu być
    @Override
    public void displayArea() {
        System.out.println("Figura: Prostokat, pole :" + countArea());
    }

    public Rectangle (float sideA, float sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    //Bonus gdy podano jeden parametr to przyjęto, że drugi ma dokładnie tyle samo
    public Rectangle (float sideA){
        this.sideA = sideA;
        this.sideB = sideA;
    }
}
