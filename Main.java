class Main {
  public static void main(String[] args) {
    int x = 64;
    System.out.println("for x = "+x);
    mathops(x);
  }

  public static void mathops(int x) {
    double a = Math.pow(x, 2);
    System.out.println("x squared = "+a);
    double b = Math.sqrt(x);
    System.out.println("the square root of x is "+b);
    double c = Math.log(x);    System.out.println("the natural log of x is "+c);
    double d = Math.cos(x);    System.out.println("the cosine of x is "+d);
    double e = Math.sin(x);    System.out.println("the sine of x is "+e);
    double f = Math.tan(x);    System.out.println("the tangent of x is "+f);
  }
}