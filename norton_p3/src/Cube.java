public class Cube extends Shape3D{
    public String cubeName = "cube";

    public Cube(double sideLength){
        this.sideLength = sideLength;
    }

    @Override
    public double getVolume() {
        double volume;

        volume = Math.pow(sideLength, 3);
        return volume;
    }

    @Override
    public double getArea() {
        double area;

        area = 6 * (Math.pow(sideLength, 2));
        return area;
    }

    @Override
    public String getName() {
        return cubeName;
    }
}
