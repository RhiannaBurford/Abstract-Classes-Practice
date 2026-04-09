public class Cube extends Shape3D {

    private double side;

    public Cube(double side){
        this.side = side;
    }

    @Override
    public double calculateVolume(){
        return Math.pow(side, 3.0);
    }

    @Override
    public double calculateSurfaceArea(){
        return (6.0 * Math.pow(side, 2.0));
    }
}
