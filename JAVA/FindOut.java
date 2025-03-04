import java.util.Scanner;

class Find
{
int length,width,height;
public void area()
{
System.out.println("Area of rectangle "+length*width);
}
public void volume()
{
System.out.println("Volume of cuboid "+length*width*height);
}
public void input()
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter length: ");
length=scan.nextInt();
System.out.print("Enter width: ");
width=scan.nextInt();
System.out.print("Enter Height: ");
height=scan.nextInt();
}
}
class FindOut extends Find
{
public static void main(String arg[])
{
FindOut f=new FindOut();
f.input();
f.area();
f.volume();
}
}