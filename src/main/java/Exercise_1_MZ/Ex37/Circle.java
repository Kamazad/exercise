package Exercise_1_MZ.Ex37;

public class Circle extends Figure {

    private final float radius;

    @Override
    public float countArea() {
        return (float) (Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public void displayArea(){
        System.out.println("Figura: Koło, pole: " + countArea());
    }

    public Circle (float radius){
        this.radius = radius;
    }
}
