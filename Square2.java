public class Square2 extends Shape2{

    private double side;

    public Square2(String colour, double side){
        super(colour);
        this.side = side;
    }

    @Override
    public double calculateArea(){
        return side * side;
    }
}
