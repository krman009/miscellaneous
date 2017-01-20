public class MethodOverload
{
  double area(double radius) {
    double pi = 3.14;
    return pi * radius * radius;
  }
  double area(double heightVal, double baseVal) {
    return (heightVal * baseVal) / 2;
  }
  int area(int width, int length) {
    return width * length;
  }

  public static void main(String[] args) {
    double a, b;
    int c;
    // Have to take object of class because this can't be used in static method.
    MethodOverload m = new MethodOverload();
    a = m.area(12.12);
    b = m.area(12.12, 12.12);
    c = m.area(12, 12);
    System.out.println(a + " " + b + " " + c);
  }
}


/*
Output:

461.2484159999999 73.4472 144
*/
