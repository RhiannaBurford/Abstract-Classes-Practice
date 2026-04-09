public class Triangle extends Shape{
    
    private double base;
    private double perp_height;
    private double side2;
    private double side3;

    public Triangle(double base, double perp_height, double side2, double side3){
        this.base = base;
        this.perp_height = perp_height;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea(){
        return (0.5 * base * perp_height);
    }
    @Override
    public double calculatePerimeter(){
        return (base + side2 + side3);
    }
}
