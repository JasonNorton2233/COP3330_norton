public class Circle extends Shape2D {
    public String circleName = "circle";

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area;

        area = Math.PI * (Math.pow(radius, 2));
        return area;
    }

    @Override
    public String getName(){
        return circleName;
    }
}
