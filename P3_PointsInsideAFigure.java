import java.util.Scanner;


public class P3_PointsInsideAFigure {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//@SuppressWarnings("unused")
		Scanner scan = new Scanner(System.in);
		float x = 0.0F;
		float y = 0.0F;
		String[] coordinates = scan.nextLine().trim().split(" ");
		for (int i = 0; i < coordinates.length; i++) {
			x = Float.parseFloat(coordinates[i]);
			i++;
			y = Float.parseFloat(coordinates[i]);
		}
		
		
		boolean insideRec = x >= 12.5 && x <= 22.5 && y >= 6 && y <= 13.5;
		boolean outsideRec = x > 17.5 && x < 20 && y > 8.5 && y < 13.5;
		
		if (insideRec ^ outsideRec) {
			System.out.println("inside");
		}
		else {
			System.out.println("outside");
		}
	}	

}
