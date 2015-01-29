import java.util.Scanner;


public class P5_DecToHex {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int decNumber = scan.nextInt();
		String hex = Integer.toHexString(decNumber);
		System.out.println(hex.toUpperCase());
	}

}
