public class Circle {
    public double radius;

    // radius is zero;
    Circle(){
        radius = 0;
    }

    Circle(double Radius){
        this.radius = Radius;
    }

    private double getRadius(){
        return this.radius;
    }

    private void setRadius(double Radius){
        this.radius = Radius;
    }

    public double getArea(){
        return Math.PI * radius;
    }

    public double getCircumference(){
        return Math.PI * 2 * radius;
    }

}
