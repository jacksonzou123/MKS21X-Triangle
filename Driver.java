public class Driver{
  public static void main(String[] args) {
    Triangle a = new Triangle(0,0,3,4,3,0);
    Triangle b = new Triangle(34,23,523,12,34,54);
    System.out.println(a);
    System.out.println(a.getVertex(1));
    System.out.println(a.getVertex(2));
    System.out.println(a.getVertex(3));
    System.out.println(a.getPerimeter());
    System.out.println(b);
    System.out.println(b.getVertex(1));
    System.out.println(b.getVertex(2));
    System.out.println(b.getVertex(3));
    System.out.println(b.getPerimeter());
    Point c = new Point(-1,5);
    a.setVertex(1, c);
    System.out.println(a.getVertex(1));
  }
}
