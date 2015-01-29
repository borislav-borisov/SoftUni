import java.util.Scanner;


public class P6_FormattingNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		String hex = String.format("%-10s", Integer.toHexString(a).toUpperCase());
		String bin = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
		String bFormatted = String.format("%10.2f", b);
		String cFormatted = String.format("%-10.3f", c);
		System.out.printf("|" + hex + "|" + bin + "|" + bFormatted + "|" + cFormatted + "|\n");
	}

}
