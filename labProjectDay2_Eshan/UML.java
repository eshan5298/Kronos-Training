package labProjectDay2_Eshan;


class Circle{
	private double radius = 1;
	private String color = "red";
	
	public Circle() {
		
	}
	public Circle(double r) {
		this.radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}
}
public class UML {

	public static void main(String[] args) {
		Circle c = new Circle();
		Circle c1 = new Circle(2);
		System.out.println("The radius of c is: "+c.getRadius());
		System.out.println("The area of c is:" + c.getArea());
		System.out.println("The color of c is:"+c.getColor());
		System.out.println("The radius of c1 is: "+c1.getRadius());
		System.out.println("The area of c1 is:" + c1.getArea());
		System.out.println("The color of c1 is:"+c1.getColor());
	}

}
