abstract class Shape
{
 abstract void numberOfSides();
 
}

class Rectangle extends Shape
{
  void numberOfSides()
  {
   System.out.println("The no. of sides in a rectangle is 4");
  }
}

class Triangle extends Shape
{
  void numberOfSides()
  {
   System.out.println("The no. of sides in a triangle is 3");
  }
}

class Hexagon extends Shape
{
  void numberOfSides()
  {
   System.out.println("The no. of sides in a Hexagon is 6");
  }
}

class Polymorphism
{
 public static void main(String args[])
 {
   Rectangle r=new Rectangle();
   Triangle t=new Triangle();
   Hexagon h=new Hexagon();
   r.numberOfSides();
   t.numberOfSides();
   h.numberOfSides();
 }
}

