import java.util.Scanner;


public class P8_CountOfEqualBitPairs {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		String bin = Integer.toBinaryString(n);
		System.out.println(bin);
		for (int i = 0; i < bin.length(); i++) {
			if (n == 0) {
				break;
			} 
			else if (((n >> i) & 3)== 3 || ((n >> i) & 3)== 0) {
				count++;
			} 
		}
		System.out.println(count);
	}

}
