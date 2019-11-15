// class Rectangle that constructs a rectangle
// @author Casey Lambert
// Date November 15, 2019
public class Rectangle {
	double width = 1;
	double height = 1;

	Rectangle() {
		
	}
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	double getArea() {
		return width * height;
	}
	double getPerimeter() {
		return 2 * (width + height);
	}
	void setWidth(double newWidth) {
		width = newWidth;
	}
	void setHeight(double newHeight) {
		height = newHeight;
	}
}