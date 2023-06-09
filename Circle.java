public class Circle {
    double r;
    public Circle(double radius){
        r=radius;
    }
    public double area(){
        double a;
        a=22/7*(r*r);
        return a;
    

    }
    public void display(){
        System.out.println("radius of circle is"+r);
        System.out.println("area of circle is"+area());
    }
}
