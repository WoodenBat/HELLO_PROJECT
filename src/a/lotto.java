package a;

import java.util.Random;
import java.util.Scanner;

public class lotto {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = new Random().nextInt(45) + 1;
			
			for (int j = 0; j < i; j++) {
				
				if (lotto[i] == lotto[j]) {
					
					i--;
					
					break;
				}
			}
			
		}
		
		int[] numarr = new int[6];
		
		int cnt = 0;
		
		for (int i = 0; i < numarr.length; i++) {
			
			if (i < 0) {
				i = 0;
			}
			
			System.out.print(i + 1 + "번째 번호 입력 ");
			int input = scan.nextInt();
			int trigger = 0;
			
			for (int j = 0; j < numarr.length; j++) {
				
				if (input == numarr[j] && i != 0) {
					System.out.println("중복된 번호입니다.");
					i--;
					trigger = 1;
					break;
					
				} else if (input > 45 || input < 1) { 
					System.out.println("1이상 45이하의 수만 입력");
					i--;
					trigger = 1;
					break;
					
				} else if (input == lotto[j]) {
					cnt++;
					break;
				}
			}
			
			if (trigger != 1) {
				numarr[i] = input;
			}
		}
		
		System.out.print("lotto 번호 : ");
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		System.out.println();
		System.out.print("입력한 번호 : ");
		
		for (int i = 0; i < numarr.length; i++) {
			System.out.print(numarr[i] + " ");
		}
		
		System.out.println();
		System.out.println("맞은 갯수 : " + cnt);
	}
}
