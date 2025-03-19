package a;

import java.util.Scanner;

public class Hello4 {
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("숫자 입력");
//		int num = scan.nextInt();
//		scan.close();
//		
//		for (int i = 1; i <= 9; i++) {
//			System.out.print((i * num) + " ");
//		}
//		System.out.println();
//		System.out.println("------------------------------");
		
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");

			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			
			System.out.println();
		}
	}
}
