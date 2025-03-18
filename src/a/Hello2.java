package a;

import java.util.Scanner;

public class Hello2 {
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("나이 입력");
//		int age = scan.nextInt();
//		
//		if(age >= 20) {
//			System.out.println("20세 이상");
//		}
//		System.out.println("종료");
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자 두개 입력");
//		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		if(a > 10 ^ b > 10) {
//			System.out.println("둘다 10보다 큼");
//		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("커피 가격 입력");
		int price = scan.nextInt();
		
		System.out.println("커피 수량 입력");
		int amount = scan.nextInt();
		
		int total_Price = price * amount;
		double point = total_Price * 0.05;
		System.out.println(total_Price + "원");
		
		if(total_Price > 100000) {
			System.out.println("카드 계산만 가능");
			System.out.printf("포인트 %1.1f 원 적립\n", point);
		} else if (50000 < total_Price) {
			
		}
		System.out.println("나가");
		
	}
}
