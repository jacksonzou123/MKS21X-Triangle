public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public static double distance(Point p1, Point p2){
    return Math.sqrt(Math.pow((p2.getX()-p1.getX()),2) + (Math.pow((p2.getY()-p1.getY()),2)));
  }

  public double distanceTo(Point p){
    return Math.sqrt(Math.pow((this.getX()-p.getX()),2) + (Math.pow((this.getY()-p.getY()),2)));
  }
}
