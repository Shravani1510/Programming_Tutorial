
public class Circle {
	public static double Circle1( int r ) {
	    
		double Area = Math.PI * r * r;
		return Area;
	}
		public static double Circle2(int r) {
	double diameter = 2*r;
	return diameter;
		}
	public static double Circle3(int r) {
		double circumference = 2 * Math.PI * r;
		return circumference;
	}
	
	public static void main(String[] args) {
		int c = 10;
		double A = Circle1(c);
		double B = Circle2(c);
		double C = Circle3(c);
		
		System.out.println("Area of circle is" + " "+  A);
	    System.out.println("diameter of circle is" + " "+ B );
		System.out.println("circumference of circle is " + " " + C);
		
	}
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
}
