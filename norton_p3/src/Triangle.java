public class Triangle extends Shape2D {
    public String triangleName = "triangle";

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area;

        area = 0.5 * (base * height);
        return area;
    }

    @Override
    public String getName(){
        return triangleName;
    }
}
