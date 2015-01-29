import java.util.Scanner;


public class P9_PointsInsideTheHouse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		if (isInRectangle(x, y) == true || isInTriangle(x, y) == true) {
			System.out.println("Inside");
		}
		else { System.out.println("Outside"); }
	}
	
	public static Boolean isInRectangle(double x, double y){
		boolean isInRectangle = false;
		if (x >= 12.5 && x <= 22.5 && y >= 8.5 && y <= 13.5) {
			if (x > 17.5 && x< 20 && y > 8.5) {
				isInRectangle = false;
			}
			else {
				isInRectangle = true;
			}
		}
		else {
			isInRectangle = false;
		}
		return isInRectangle;
	}
	
	public static Boolean isInTriangle(double x, double y){
		boolean isInTriangle = false;
		double bottomPosition = ((22.5-12.5)*(y-8.5) - (8.5-8.5)*(x-12.5));
		double leftPosition = ((17.5-12.5)*(y-8.5) - (3.5-8.5)*(x-12.5));
		double rightPosition = ((22.5-17.5)*(y-3.5) - (8.5-3.5)*(x-17.5));
		if (bottomPosition <= 0 && leftPosition >= 0 && rightPosition >= 0) {
			isInTriangle = true; 
		}
		return isInTriangle;
	}

}
