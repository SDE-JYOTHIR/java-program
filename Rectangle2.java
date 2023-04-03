class Rectangle2
{
double length;
int breadth;
double area;
void setData()
{
  length=12.48;
  System.out.println("the length of rectangle is:"+length);
  breadth=13;
  System.out.println("the breadth of rectangle is:"+breadth);
}
void getArea()
{
area=length*breadth;
System.out.println("the area of rectangle:"+area);
}


public static void main(String args[])
{
Rectangle2 r1=new Rectangle2();
r1.setData();
r1.getArea();
}
}
