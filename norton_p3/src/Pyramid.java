public class Pyramid extends Shape3D{
    public String pyramidName = "pyramid";

    public Pyramid (double base, double height, double sideLength){
        this.base = base;
        this.height = height;
        this.sideLength = sideLength;
    }

    @Override
    public double getVolume() {
        double volume;

        volume = (sideLength * base * height) / 3.0;
        return volume;
    }

    @Override
    public double getArea(){
        double area;

        area = (sideLength * base) + ((sideLength) * Math.sqrt((Math.pow(base / 2.0, 2.0) + Math.pow(height, 2.0)))) +
                ((base) * Math.sqrt(Math.pow(sideLength / 2.0, 2.0) + Math.pow(height, 2.0)));
        return area;
    }
    @Override
    public String getName() {
        return pyramidName;
    }
}
