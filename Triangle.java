public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point point1, Point point2, Point point3) {
    v1 = new Point(point1);
    v2 = new Point(point2);
    v3 = new Point(point3);
  }


  public Triangle(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y) {
    v1 = new Point(p1x, p1y);
    v2 = new Point(p2x, p2y);
    v3 = new Point(p3x, p3y);
  }

  public Triangle() {
    v1 = new Point(0,0);
    v2 = new Point(0,0);
    v3 = new Point(0,0);
  }

  public double getPerimeter() {
    return Point.distance(v1,v2) + Point.distance(v2,v3) + Point.distance(v1,v3);
  }

  public static void main(String[] args) {
    Triangle a = new Triangle(0,0,3,4,3,0);
    System.out.println(a.getPerimeter());
  }
}
