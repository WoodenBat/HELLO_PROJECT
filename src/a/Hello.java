package a;

public class Hello {
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
	}
}
