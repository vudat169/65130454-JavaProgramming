package lab1;

import java.util.Scanner;

public class Bai2_ChuViDT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Nhập 2 cạnh hình chữ nhật
		System.out.print("Nhập cạnh thứ nhất: ");
		double a = scanner.nextDouble();

		System.out.print("Nhập cạnh thứ hai: ");
		double b = scanner.nextDouble();

		// Tính toán
		double chuVi = (a + b) * 2;
		double dienTich = a * b;
		double canhNho = Math.min(a, b);

		// Xuất kết quả
		System.out.println("----- KẾT QUẢ -----");
		System.out.println("Chu vi hình chữ nhật: " + chuVi);
		System.out.println("Diện tích hình chữ nhật: " + dienTich);
		System.out.println("Cạnh nhỏ của hình chữ nhật: " + canhNho);

		scanner.close();
	}
}

