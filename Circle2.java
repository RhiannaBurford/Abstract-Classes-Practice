public class Circle2 extends Shape2{

    private double radius;

    public Circle2(String colour, double radius){
        super(colour);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
