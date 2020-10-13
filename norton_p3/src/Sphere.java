public class Sphere extends Shape3D {
    public String sphereName = "sphere";

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area;

        area = 4 * (Math.PI * (Math.pow (radius, 2)));
        return area;
    }

    @Override
    public String getName() {
        return sphereName;
    }

    @Override
    public double getVolume() {
        double volume;

        volume = (4.0/3.0) * Math.PI * (Math.pow(radius, 3));
        return volume;
    }//4/3 * pi * r^3
}
