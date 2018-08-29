
public class Triangle {

	public double side1;
	public double side2;
	public double side3;
	
	public Triangle(double s1, double s2, double s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double areaofTriangle() {
		double s = (side1 + side2 + side3 / 2.0);
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3) );
		return area;
	}
	
	public double sumOfSides() {
		double sides = side1 + side2 + side3;
		return sides;
	}
	
}
