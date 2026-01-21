package lab1;

import java.util.Scanner;

public class Bai4_Delta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Nhập các hệ số a, b, c
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();

		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();

		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();

		// Tính delta
		double delta = b * b - 4 * a * c;

		// Xuất delta và căn delta
		System.out.println("Delta = " + delta);

		if (delta >= 0) {
			double canDelta = Math.sqrt(delta);
			System.out.println("Căn delta = " + canDelta);
		} else {
			System.out.println("Delta âm, không có căn bậc hai thực");
		}

		scanner.close();
	}
}
