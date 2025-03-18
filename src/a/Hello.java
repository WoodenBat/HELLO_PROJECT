package a;

import java.util.Scanner;

public class Hello {
	int i = 25;
	public static void main(String[] args) {
		int i = 10;
		int j = 123123;
		char ch = 'a';
		String str = "Hello";
		float f = 10.021f;
		boolean bool = true;
		
		System.out.println(Integer.toString(i) + 10);
		System.out.println((Integer.toString(i) + 10).getClass());
		System.out.println(i + 10);
		System.out.println(((Object)(i + 10)).getClass());
		System.out.println(String.valueOf(j) + 10);
		System.out.println(j + 10);
		System.out.println((int)ch);
		
		if(i > 5) {
			bool = !bool;
		}
		System.out.println(bool);
		
		byte a = 1;
		byte b = 2;
		byte c = (byte)(a + b);
		System.out.println(c);
		boolean test = true;
		test = !test;
		System.out.println(String.valueOf(test));
		System.out.println((String.valueOf(test)).getClass());
		System.out.printf("감자 %d %f %c", i, f, ch);
		Scanner scan = new Scanner(System.in);
		System.out.println();
		
		String str2 = scan.next();
		System.out.println(str2);
	}
}
