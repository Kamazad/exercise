package Exercise_2_SDA.Ex12_AND_EX13;

public class OrderItem {
    //a.
    private String nameOfProduct;
    private int quantity;
    private double priceOfOne;

    //b.
    public OrderItem (String nameOfProduct, int quantity, double priceOfOne){
        this.nameOfProduct = nameOfProduct;
        this.quantity = quantity;
        this.priceOfOne = priceOfOne;
    }
    //c.
    public Double getValue(){
        return (this.priceOfOne * this.quantity);
    }

    public boolean isCorrect (){
        if(this.quantity >0 && this.priceOfOne >0){
            return true;
        } else {
            return false;
        }
    }
    public void print (){
        System.out.println(this.nameOfProduct +" " +this.priceOfOne + " zł "
                + this.quantity+ " szt "+ (this.quantity*this.priceOfOne)
                + " zł");
    }

}
