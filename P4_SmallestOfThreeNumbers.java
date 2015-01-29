import java.util.Scanner;


public class P4_SmallestOfThreeNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		//float smallest = Float.MAX_VALUE;
		if (a <= b && a <= c) {
			System.out.printf(fmt(a));
		}
		else if (b <= a && b <= c) {
			System.out.printf(fmt(b));
		}
		else {
			System.out.printf(fmt(c));
		}
	}
	
	public static String fmt(float d)
	{
	    if(d == (long) d)
	        return String.format("%d",(long)d);
	    else
	        return String.format("%s",d);
	}
}
