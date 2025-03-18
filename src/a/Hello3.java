package a;

import java.util.Scanner;

public class Hello3 {
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("숫자입력");
//		
//		int num = scan.nextInt();
//		scan.close();
		
		int result = 0;
		
//		for(int i = 1; i <= num; i++) {
//			result = result + i;
//		}
//		
//		System.out.println(result);
		
		int i = 1;
		
		while(result <= 100000) {
			result = result + i;
			i++;
		}
		i = i - 1;
		System.out.println(i);
//		
//		int res2 = 0;
//		int j = 1;
//		
//		while(j <= i) {
//			res2 = res2 + j;
//			j++;
//		}
//		
//		System.out.println(res2);
		
//		for(int i = 1; i <= 10; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
	}
}
