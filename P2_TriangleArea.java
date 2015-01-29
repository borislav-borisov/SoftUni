import java.util.Scanner;


public class P2_TriangleArea {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ax = scan.nextInt();
		int ay = scan.nextInt();
		int bx = scan.nextInt();
		int by = scan.nextInt();
		int cx = scan.nextInt();
		int cy = scan.nextInt();
		int area = ((ax * (by - cy)) + (bx * (cy - ay)) + (cx * (ay - by))) / 2;
		System.out.println(area);
	}
}
