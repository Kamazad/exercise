package Exercise_1_MZ.Ex37;

// * iii. Utwórz konstruktor przyjmujący wszystkie parametry potrzebne do
// * obliczenia pola.


public class Square extends Figure{
    private float side;

    @Override
    public float countArea(){
        return (this.side * this.side);
    }

    @Override
    public void displayArea(){
        System.out.println("Figura: Kwadrat, pole: " + countArea());
    }

    public Square(float side){
        this.side = side;
    }
}
