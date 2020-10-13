public class Square extends Shape2D {
    public String squareName = "square";

    public Square(double sideLength){
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        double area;

        area = Math.pow(sideLength, 2);
        return area;
    }

    @Override
    public String getName(){
        return squareName;
    }
}
