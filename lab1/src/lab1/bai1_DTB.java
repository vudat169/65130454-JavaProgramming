package lab1;

import java.util.Scanner;

public class bai1_DTB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Nhập họ và tên sinh viên
		System.out.print("Nhập họ và tên sinh viên: ");
		String hoTen = scanner.nextLine();

		// Nhập điểm trung bình
		System.out.print("Nhập điểm trung bình: ");
		double diemTB = scanner.nextDouble();

		// Xuất ra màn hình
		System.out.println("----- THÔNG TIN SINH VIÊN -----");
		System.out.println("Họ và tên: " + hoTen);
		System.out.println("Điểm trung bình: " + diemTB);

		scanner.close();
	}
}
