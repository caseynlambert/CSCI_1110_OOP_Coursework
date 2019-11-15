// class Ex_9_1 uses class Rectangle to generate two rectangles, and prints their width, height, area, and perimeter
// @author Casey Lambert
// Date November 15, 2019
public class Ex_9_1 {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("This rectangle with width "
		 + rectangle1.width + ", and height "
		 + rectangle1.height + ", has an area of "
		 + rectangle1.getArea() + ", and a perimeter of "
		 + rectangle1.getPerimeter());
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("This rectangle with width "
		 + rectangle2.width + ", and height "
		 + rectangle2.height + ", has an area of "
		 + rectangle2.getArea() + ", and a perimeter of "
		 + rectangle2.getPerimeter());
	}
}
