import java.util.Scanner;


public class P7_CountOfBitsOne {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int counter = 0;
		String bin = String.format("%16s", Integer.toBinaryString(n)).replace(' ', '0');
		System.out.println(bin);
		for (int i = 0; i < 16; i++) {
			if (((n >> i) & 1) == 1) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
