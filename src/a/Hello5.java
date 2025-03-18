package a;

public class Hello5 {
	public static void main(String[] args) throws InterruptedException {
		
		while(true) {
			int i = 0;
			while(i <= 100) {
				int k = 0;
				while(k <= 100) {
					System.out.printf("\b\b");
					k++;
				}
				System.out.print(":");
				int j = 0;
				while(j < i) {
					System.out.print("=");
					j++;
				}
				System.out.print(">");
				int o = 0;
				while(o < 100 - i) {
					System.out.print("-");
					o++;
				}
				
				System.out.print(":");
				System.out.print(i);
				Thread.sleep(100);
				
				i++;
			}
			System.out.println();
		}
	}
}
