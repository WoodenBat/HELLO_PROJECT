package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class test {
	public static void main(String[] args) {
		
		String num = "16234020200";
		String[] arr = new String[0];
		int j = 0;
		
		for (int i = num.length() - 3; 0 < i; i = i - 3) {
			
			arr = Arrays.copyOf(arr, arr.length + 1);
			
			String a = num.substring(i, i + 3);
			arr[j] = a;
			
			System.out.println(arr[j]);
			
			j++;
			
		}

		List<String> list = new ArrayList<>(Arrays.asList(arr));
		System.out.println(list.toString());
		
		Collections.reverse(list);
		System.out.println(list.toString());
		
//		list.removeIf(Objects::isNull);
		
		String[] arr2 = list.toArray(new String[j]);
		
		String init = num.substring(0, num.length() - j * 3);
		
		System.out.println(init);
		
		for (int i = 0; i < j; i++) {
			init = init.concat(",").concat(arr2[i]);
		}
		System.out.println("result : " + init);
	}
}
