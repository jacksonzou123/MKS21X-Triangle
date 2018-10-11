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

  public String toString() {
    return "Triangle: A" +Point.format(v1) + " B" + Point.format(v2) + " C" + Point.format(v3);
  }

  public Point getVertex(int index) {
    if (index == 1) {
      return new Point(v1);
    }
    if (index == 2) {
      return new Point(v2);
    }
    if (index == 3) {
      return new Point(v3);
    }
    return new Point(0,0);
  }

  public void setVertex(int index, Point newP) {
    if (index == 1) {
      v1 = new Point(newP);
    }
    if (index == 2) {
      v2 = new Point(newP);
    }
    if (index == 1) {
      v3 = new Point(newP);
    }
  }

}
