import java.util.Scanner;

public class Primenumbers {
	public static void main(String[] args) {

		int len;
		Scanner sc = new Scanner(System.in);
		len = sc.nextInt();
		
	//	len = sc.nextInt();

		for (int n = 1; n < len; n++) {

			int count = 0;

			for (int i = 2; i < n; i++) {

				if (n % i == 0) {
					count++;
					break;
				}
			}

			if (count == 0 && n != 1) {
				System.out.print(n + " ");
			}
		}
	}

}
