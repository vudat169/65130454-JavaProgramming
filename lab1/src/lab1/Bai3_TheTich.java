package lab1;

import java.util.Scanner;

public class Bai3_TheTich {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Nhập cạnh khối lập phương
		System.out.print("Nhập cạnh của khối lập phương: ");
		double canh = scanner.nextDouble();

		// Tính thể tích
		double theTich = Math.pow(canh, 3);

		// Xuất kết quả
		System.out.println("Thể tích của khối lập phương là: " + theTich);

		scanner.close();
	}
}
