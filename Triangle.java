public class Triangle{
  private Point point1;
  private Point point2;
  private Point point3;

  public Triangle(Point point1, Point point2, Point point3) {
    this.point1 = Point(point1);
    this.point2 = Point(point2);
    this.point3 = Point(point3);
  }

  public Triangle() {
    point1 = Point(0,0);
    point2 = Point(0,0);
    point3 = Point(0,0);
  }
}
